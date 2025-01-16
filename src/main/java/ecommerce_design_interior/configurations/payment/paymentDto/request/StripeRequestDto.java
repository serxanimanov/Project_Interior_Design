package ecommerce_design_interior.configurations.payment.paymentDto.request;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StripeRequestDto {

    private Long userId;
    private Long amount;
    private String currency;
    private long membershipPlanId;

}
