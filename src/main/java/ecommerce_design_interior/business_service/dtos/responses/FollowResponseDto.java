package ecommerce_design_interior.business_service.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FollowResponseDto {

    private Long id;
    private Long userId;
    private Long designerId;
    private String designerName;
    private Boolean isFollowed;

}
