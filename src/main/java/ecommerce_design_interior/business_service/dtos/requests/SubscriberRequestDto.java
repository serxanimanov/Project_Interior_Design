package ecommerce_design_interior.business_service.dtos.requests;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubscriberRequestDto {

    @Email
    private String email;




}
