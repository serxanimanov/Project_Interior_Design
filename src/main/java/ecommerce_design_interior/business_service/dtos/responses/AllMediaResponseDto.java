package ecommerce_design_interior.business_service.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AllMediaResponseDto {

    private Long id;
    private String designedObjectName;
    private String designedObjectDescription;
    private List <String> designedObjectPhotos;
    private Date createdAt;
    private String mediaType;

}
