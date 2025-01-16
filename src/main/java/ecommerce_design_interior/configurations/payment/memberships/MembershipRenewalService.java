package ecommerce_design_interior.configurations.payment.memberships;

import com.stripe.exception.StripeException;
import ecommerce_design_interior.configurations.payment.paymentDto.request.StripeRequestDto;
import ecommerce_design_interior.configurations.payment.paymentService.StripeService;
import ecommerce_design_interior.entities.users.client.MembershipEntity;
import ecommerce_design_interior.repositories.dataAccessAbstracts.MembershipRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MembershipRenewalService {

    private static final Logger log = LoggerFactory.getLogger(MembershipRenewalService.class);

    private final MembershipRepository membershipRepository;
    private final StripeService stripeService;

    @Scheduled(cron = "${membership.renewal-cron}")
    public void processDailyMembershipRenewals() {
        log.info("Daily membership renewal process started.");
        List<MembershipEntity> activeMemberships = membershipRepository.findAllByIsActiveTrue();
        if (activeMemberships.isEmpty()) {
            log.info("No active memberships found for renewal.");
            return;
        }

        for (MembershipEntity membership : activeMemberships) {
            try {
                processMembershipRenewal(membership);
            } catch (Exception e) {
                log.error("Failed to renew membership for User ID: {}. Error: {}",
                        membership.getUserId().get(0).getId(), e.getMessage(), e);
            }
        }
        log.info("Daily membership renewal process completed.");
    }

    private void processMembershipRenewal(MembershipEntity membership) throws StripeException {

        StripeRequestDto requestDto = preparePaymentRequest(membership);
        stripeService.createPayment(
                requestDto.getUserId(),
                requestDto.getAmount(),
                requestDto.getCurrency());

        activateMembership(membership);
    }

    private StripeRequestDto preparePaymentRequest(MembershipEntity membership) {
        Long userId = membership.getUserId().get(0).getId();
        PlansEnum planType = convertToEnum(String.valueOf(membership.getPlanType()));
        long amount = (long) (planType.getIncreasedPrice() * 100); // Plan fiyatını Enum'dan alıyoruz
        String currency = "usd";
        log.debug("Preparing payment request for User ID: {} with amount: {} {}", userId, amount, currency);
        return new StripeRequestDto(userId, amount, currency, planType.getMessage());//todo enumdan dyisklik etmisem
    }

    private void activateMembership(MembershipEntity membership) {
        membership.setActive(true);
        membershipRepository.save(membership);
        log.info("Membership renewed successfully for User ID: {}", membership.getUserId().get(0).getId());
    }
}
