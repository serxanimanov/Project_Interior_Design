package ecommerce_design_interior.configurations.payment.cartPayment.cartPaymentController;


import com.stripe.exception.StripeException;
import ecommerce_design_interior.configurations.payment.cartPayment.cartPaymentService.CartPaymentService;
import ecommerce_design_interior.configurations.payment.paymentDto.response.StripeResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//global exception layout


@RestController
@RequestMapping("/api/payments/cart")
@RequiredArgsConstructor
public class CartPaymentController {

    private final CartPaymentService cartPaymentService;

    @PostMapping("/{cartId}")
    public ResponseEntity<StripeResponseDto> processCartPayment(
            @PathVariable Long cartId,
            @RequestParam String currency,
            @RequestParam String description
    )
            throws StripeException {
        StripeResponseDto response = cartPaymentService.processCartPayment(cartId, currency,description);
        return ResponseEntity.ok(response);
    }
}

