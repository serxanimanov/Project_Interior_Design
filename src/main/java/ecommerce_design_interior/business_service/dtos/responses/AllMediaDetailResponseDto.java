package ecommerce_design_interior.business_service.dtos.responses;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AllMediaDetailResponseDto{

    private Long id;
    private String title;
    @Size
    private String designedObjectName;
    private List<String> designedObjectPhoto;
    private String designedObjectDescription;
    private Date createdAt;
    private String designerName;
    private String allMediaTypeEnum; // enum
    private Integer likeCount;
}
