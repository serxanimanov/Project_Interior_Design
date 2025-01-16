package ecommerce_design_interior.enums;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MakingItemTypeEnum {

    HANDMADE("Handmade"),
    FACTORY_MADE("Factory Made"),
    CUSTOM_MADE("Custom Made"),
    MASS_PRODUCED("Mass Produced"),
    ARTISANAL("Artisanal"),
    CRAFTED("Crafted"),
    INDUSTRIAL_MADE("Industrial Made"),
    PRE_BUILT("Pre-Built"),
    ECO_FRIENDLY("Eco-Friendly"),
    SUSTAINABLE_MADE("Sustainable Made");


    private final String message;


}
