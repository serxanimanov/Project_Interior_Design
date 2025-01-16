package ecommerce_design_interior.business_service.dtos.responses;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FooterResponseDto {

    private Long id;// maraqlidi
    private String aboutUs;
    private String blog;
    private String privacyPolicy;
    private String termsOfService;


}
