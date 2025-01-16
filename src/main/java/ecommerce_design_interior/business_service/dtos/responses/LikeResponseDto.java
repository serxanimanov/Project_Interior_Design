package ecommerce_design_interior.business_service.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LikeResponseDto {

    private Long id;
    private Long roomId;
    private Boolean isLiked;
    private Integer totalLike;


}
