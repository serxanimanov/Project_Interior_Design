package ecommerce_design_interior.business_service.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Data
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
public class MembershipResponseDto {

    private Long id;
    private String planName;//enum
    private String pricePerDay;
    //  private Double totalPrice;
    private Integer duration;
    private List<String> features;
    private Boolean isActive;

}
