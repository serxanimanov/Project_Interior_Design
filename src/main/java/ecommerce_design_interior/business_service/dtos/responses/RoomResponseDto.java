package ecommerce_design_interior.business_service.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomResponseDto {

    private Long id;
    private List<String> designPlacePhotosRes;
    private String designNameRes;
    private String tag;



   // private String eachTagCountMedia;//entityde yoxdu havada qalir

//private String designDescriptionRes;

}
