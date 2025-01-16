package ecommerce_design_interior.configurations.payment.paymentService;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.stripe.param.PaymentIntentCreateParams;
import com.stripe.param.checkout.SessionCreateParams;
import ecommerce_design_interior.configurations.payment.paymentDto.request.StripeRequestDto;
import ecommerce_design_interior.configurations.payment.paymentDto.response.StripeResponseDto;
import ecommerce_design_interior.configurations.payment.paymentEntity.StripeEntity;
import ecommerce_design_interior.configurations.payment.paymentRepository.StripeRepository;
import ecommerce_design_interior.entities.users.UserEntity;
import ecommerce_design_interior.entities.users.client.MembershipPlansEntity;
import ecommerce_design_interior.mappers.ModelMapperManager;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StripeService {
    private static final Logger log = LoggerFactory.getLogger(StripeService.class);

    private final StripeRepository stripeRepository;
    private final ModelMapperManager modelMapperManager;

    @Value("${stripe.secret.key}")
    private String secretKey;

    @PostConstruct
    public void init() {
        Stripe.apiKey = secretKey;
    }

     /// Creating a general payment
//    public StripeResponseDto createPayment(StripeRequestDto requestDto ) throws StripeException {
//        PaymentIntent paymentIntent = createStripePaymentIntent(requestDto.getAmount(), requestDto.getCurrency(), requestDto.getMembershipPlanId());
//        StripeEntity stripeEntity = savePaymentEntity(requestDto.getUserId(), paymentIntent, requestDto.getAmount(), requestDto.getCurrency(),requestDto.getMembershipPlanId());
//        return modelMapperManager.forResponse().map(stripeEntity, StripeResponseDto.class);
//    }
    /**
     * Genel ödeme oluşturma metodu. Hem üyelik hem de sepet ödemeleri için kullanılabilir.
     * @param requestDto Ödeme detaylarını içeren DTO
     * @return StripeResponseDto
     * @throws StripeException
     */



//    public StripeResponseDto createPayment2(StripeRequestDto requestDto) throws StripeException {
//        SessionCreateParams.LineItem.PriceData.ProductData.builder().setName(requestDto.get())
//    }

    public StripeResponseDto createPayment(StripeRequestDto requestDto) throws StripeException {
        PaymentIntent paymentIntent = createStripePaymentIntent(requestDto);
        StripeEntity stripeEntity = savePaymentEntity(requestDto, paymentIntent);
        return modelMapperManager.forResponse().map(stripeEntity, StripeResponseDto.class);
    }


    // Stripe PaymentIntent creation
//    private PaymentIntent createStripePaymentIntent(StripeRequestDto requestDto) throws StripeException {
//        PaymentIntentCreateParams params = PaymentIntentCreateParams.builder()
//                .setAmount(requestDto.getAmount())
//                .setCurrency(requestDto.getCurrency().trim().toLowerCase())
//                .setDescription(requestDto.getMembershipPlanId())
//                .build();
//        return PaymentIntent.create(params);
//    }



    private PaymentIntent createStripePaymentIntent(StripeRequestDto requestDto) throws StripeException {
        PaymentIntentCreateParams params = PaymentIntentCreateParams.builder()
                .setAmount(requestDto.getAmount())
                .setCurrency(requestDto.getCurrency().trim().toLowerCase())
                .setDescription(String.valueOf(requestDto.getMembershipPlanId()))
                .build();
        return PaymentIntent.create(params);
    }


    // Save payment details
    private StripeEntity savePaymentEntity(StripeRequestDto requestDto, PaymentIntent paymentIntent) {

        UserEntity user = new UserEntity();
        user.setId(requestDto.getUserId());

        MembershipPlansEntity membershipPlan = new MembershipPlansEntity();
        membershipPlan.setId(requestDto.getMembershipPlanId());

        StripeEntity stripeEntity = new StripeEntity();
        stripeEntity.setPaymentIntentId(paymentIntent.getId());
        stripeEntity.setStatus(paymentIntent.getStatus());
        stripeEntity.setAmount(requestDto.getAmount());
        stripeEntity.setCurrency(requestDto.getCurrency().trim().toLowerCase());
        stripeEntity.setUser(user);
        stripeEntity.setMembershipPlan(membershipPlan);

        return stripeRepository.save(stripeEntity);
    }

    //Get Payment details
    public StripeResponseDto getPaymentDetails(Long paymentId) {
        StripeEntity stripeEntity = stripeRepository.findById(paymentId)
                .orElseThrow(() -> new RuntimeException("Payment not found"));
        return modelMapperManager.forResponse().map(stripeEntity, StripeResponseDto.class);
    }

    // Get all payments by user id
    public List<StripeResponseDto> getPaymentsByUser(Long userId) {
        List<StripeEntity> payments = stripeRepository.findByUserId(userId);
        return payments.stream()
                .map(payment -> modelMapperManager.forResponse().map(payment, StripeResponseDto.class))
                .collect(Collectors.toList());
    }

}
