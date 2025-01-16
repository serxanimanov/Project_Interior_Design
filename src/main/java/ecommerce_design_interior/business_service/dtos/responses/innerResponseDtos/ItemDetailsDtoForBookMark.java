package ecommerce_design_interior.business_service.dtos.responses.innerResponseDtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemDetailsDtoForBookMark {

    private Long id;
    private String itemName;
    private List<String> photos;


}
