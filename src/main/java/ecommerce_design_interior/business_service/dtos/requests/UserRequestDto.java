package ecommerce_design_interior.business_service.dtos.requests;

import ecommerce_design_interior.enums.RolesEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDto {

        private String email;
        private String firstName;
        private String lastName;
        private String phoneNumber;
        private String region;
        private String password;
        private RolesEnum role; // User role, default: USER
        private Long membershipPlanId; // Plan seçimi için ID
    }




