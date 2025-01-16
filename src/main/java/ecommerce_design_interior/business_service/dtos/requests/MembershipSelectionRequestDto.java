package ecommerce_design_interior.business_service.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
public class MembershipSelectionRequestDto {

    private Long membershipPlanId;
    private Long userId;
   // private boolean isActive;// sorusmaq;

}
