package ecommerce_design_interior.business_service.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AllMediaDetailRequestDto {

    private String title;
    private String designedObjectName;
    private List<String> designedObjectPhoto;
    private String designedObjectDescription;
    private String allMediaTypeEnum;
    private Long designerProfileId;

}
