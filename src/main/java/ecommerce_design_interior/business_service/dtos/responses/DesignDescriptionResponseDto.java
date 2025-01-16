package ecommerce_design_interior.business_service.dtos.responses;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DesignDescriptionResponseDto {

    private String id;
    @Size
    private String description;

}
