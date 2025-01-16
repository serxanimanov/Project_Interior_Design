package ecommerce_design_interior.configurations.payment.memberships;

import com.stripe.exception.StripeException;
import ecommerce_design_interior.configurations.payment.paymentDto.response.StripeResponseDto;
import ecommerce_design_interior.configurations.payment.paymentService.StripeService;
import ecommerce_design_interior.repositories.dataAccessAbstracts.MembershipRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MembershipPaymentService {

    private final MembershipRepository membershipRepository;
    private final StripeService stripeService;

    public StripeResponseDto processPaymentForSelectedPlan(Long userId, long baseAmount, String currency,Long membershipPlanId ) throws StripeException {
        return stripeService.createPayment()
    }
}