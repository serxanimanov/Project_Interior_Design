package ecommerce_design_interior.configurations.payment.paymentController;

import ecommerce_design_interior.configurations.payment.paymentDto.response.StripeResponseDto;
import ecommerce_design_interior.configurations.payment.paymentService.StripeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/payments")
@RequiredArgsConstructor
public class StripeController {

    private final StripeService stripeService;

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<StripeResponseDto>> getPaymentsByUser(@PathVariable Long userId) {
        List<StripeResponseDto> payments = stripeService.getPaymentsByUser(userId);
        return ResponseEntity.ok(payments);
    }

    @GetMapping("/{paymentId}")
    public ResponseEntity<StripeResponseDto> getPaymentDetails(@PathVariable Long paymentId) {
        StripeResponseDto paymentDetails = stripeService.getPaymentDetails(paymentId);
        return ResponseEntity.ok(paymentDetails);
    }
}
