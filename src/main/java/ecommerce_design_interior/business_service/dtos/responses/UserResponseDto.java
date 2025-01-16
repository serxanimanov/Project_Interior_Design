package ecommerce_design_interior.business_service.dtos.responses;

import ecommerce_design_interior.enums.RolesEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto {

    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String region;
    private RolesEnum role;
    private String membershipPlanName; // Kullanıcının aktif planı
    private Date membershipExpirationDate; // Planın btis



}
