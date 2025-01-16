package ecommerce_design_interior.business_service.dtos.responses;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemResponseForRoomDetailDto {

    private Long id;
    @Size
    private String itemNameRes;
    private String designerNameRes;
    private String itemSerialCodeRes;
    private BigDecimal itemPriceRes;
    private List<String> photosRes;


}
