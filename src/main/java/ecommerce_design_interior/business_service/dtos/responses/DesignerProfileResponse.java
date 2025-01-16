package ecommerce_design_interior.business_service.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DesignerProfileResponse {

    private Long id;
    private String name;
    private String surname;
    private String profilePicture;
    private List<AllMediaResponseDto> itemsForDesigner;
    private List<Long> designerFollower;
    private List<Long> likes;
}
