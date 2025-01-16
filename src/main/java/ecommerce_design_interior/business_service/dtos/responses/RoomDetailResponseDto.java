package ecommerce_design_interior.business_service.dtos.responses;


import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomDetailResponseDto {  //todo : room entity

    private Long id;
    private String title;// bunu sonradan elave etmisem lazim olasa entitye de elave etmek lazimdir
    private String designNameRes;
    @Size
    private String designDescriptionRes;
    private List<String> photosRes;
    //private List<ItemResponseForRoomDetailDto> roomItemsDto; todo bunu sorusmaq bir yerde yoxsa serbest api kimi mi

}
