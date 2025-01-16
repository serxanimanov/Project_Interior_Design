package ecommerce_design_interior.enums;


import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor
public enum AllMediaTypeEnum {

    FILMS("Films"),
    ARTICLE("Article"),
    MAGAZINE("Magazine"),
    SOCIAL("Social");


    private final String message;


}
