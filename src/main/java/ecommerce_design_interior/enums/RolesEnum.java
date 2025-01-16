package ecommerce_design_interior.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum RolesEnum {

    USER("USER"),
    ADMIN("ADMIN"),
    DESIGNER("DESIGNER");

    private final String message;


}
