package ecommerce_design_interior.configurations.payment.memberships;

import com.stripe.exception.StripeException;
import ecommerce_design_interior.configurations.payment.paymentDto.request.StripeRequestDto;
import ecommerce_design_interior.configurations.payment.paymentDto.response.StripeResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments/membership")
@RequiredArgsConstructor
public class MembershipPaymentController {

    private final MembershipPaymentService membershipPaymentService;

    @PostMapping("/create")
    public ResponseEntity<StripeResponseDto> processMembershipPayment(
            @RequestBody StripeRequestDto requestDto) throws StripeException {
        StripeResponseDto response = membershipPaymentService.processPaymentForSelectedPlan(
                requestDto.getUserId(),
                requestDto.getAmount(),
                requestDto.getCurrency(),
               ;
        return ResponseEntity.ok(response);
    }

}

