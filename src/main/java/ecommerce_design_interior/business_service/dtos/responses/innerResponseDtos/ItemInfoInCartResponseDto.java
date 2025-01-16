package ecommerce_design_interior.business_service.dtos.responses.innerResponseDtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemInfoInCartResponseDto {

    private Long itemId;
    private String nameRes;
    private String photoRes;
    private BigDecimal priceRes;
    private Integer quantityRes;
    private String designerNameRes;
    private String itemColorRes;

}
