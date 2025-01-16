package ecommerce_design_interior.business_service.dtos.responses;

import ecommerce_design_interior.business_service.dtos.responses.innerResponseDtos.ItemInfoInCartResponseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartResponseDto {

    private Long id;
    private List<ItemInfoInCartResponseDto> inCartResponseDto;
    private Double totalPriceOfCart;// double etdim
}