package ecommerce_design_interior.business_service.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartRequestDto {

    private Long userId;
    private Long itemId;
    private Long itemQuantity;

}
