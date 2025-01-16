package ecommerce_design_interior.business_service.abstracts;

import ecommerce_design_interior.business_service.dtos.responses.CartResponseDto;

import java.util.List;

public interface CartService {

    List<CartResponseDto> allItemsInCart();

}
