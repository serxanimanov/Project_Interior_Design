package ecommerce_design_interior.business_service.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemRequestForRoomDetailDto {

    private String itemNameRes;
    private String itemColorRes;
    private String itemCategoryEnumRes;// todo : enum
    private String designDescriptionRes;
    private String designerNameRes;// todo : subheli
    private String itemSerialCodeRes;
    private String itemDimensionRes;
    private String makingTypeEnumRes;// todo : enum
    private String itemMaterialTypeEnumRes;// todo : enum
    private BigDecimal itemPriceRes;
    private List<String> itemPhotosRes;

}
