package ecommerce_design_interior.business_service.dtos.requests;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LikeRequestDto {

    private Long userId;
    private Long roomId;

}
