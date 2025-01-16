package ecommerce_design_interior.configurations.payment.cartPayment.cartPaymentService;

import com.stripe.exception.StripeException;
import ecommerce_design_interior.configurations.payment.paymentDto.response.StripeResponseDto;
import ecommerce_design_interior.configurations.payment.paymentService.StripeService;
import ecommerce_design_interior.entities.products.CartEntity;
import ecommerce_design_interior.repositories.dataAccessAbstracts.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class CartPaymentService {

    private final CartRepository cartRepository;
    private final StripeService stripeService;

    public StripeResponseDto processCartPayment(Long cartId, String currency,String description) throws StripeException {
        CartEntity cart = cartRepository.findById(cartId)
                .orElseThrow(() -> new IllegalArgumentException("Cart not found"));

        long amount = cart.getTotalPrice().longValue();
        // creating stripe payment
        StripeResponseDto response = stripeService.createPayment(cart.getUserEntity().getId(), amount, currency);
        // Update cart after payment
        updateCartAfterPayment(cart);

        return response;
    }

    private void updateCartAfterPayment(CartEntity cart) {
        cart.setTotalPrice(BigDecimal.ZERO);
        cart.getItemEntityList().forEach(item -> item.setItemQuantity(0));
        cartRepository.save(cart);
    }
}
