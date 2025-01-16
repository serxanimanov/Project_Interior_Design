package ecommerce_design_interior.configurations.payment.paymentDto.response;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StripeResponseDto {

    private String paymentIntentId;
    private String status;
    private Long amount;
    private String currency;

}
