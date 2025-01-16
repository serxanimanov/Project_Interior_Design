package ecommerce_design_interior.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum MeetingTypeEenum {

    INDIVIDUAL("Individual meeting"),
    COMPANY("Company level meeting");

    private final String message;

}
