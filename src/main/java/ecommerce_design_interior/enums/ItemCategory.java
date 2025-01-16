package ecommerce_design_interior.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ItemCategory {

        ART_DECOR("Art & Decor", "Artwork, sculptures, and decorative items for the home."),
        KITCHEN_APPLIANCES("Kitchen Appliances", "Appliances used in the kitchen for food preparation and cooking."),
        SOFAS("Sofas", "Sofas and seating arrangements for comfort and relaxation."),
        ELECTRONICS("Electronics", "Electrical devices and gadgets."),
        LIGHTING("Lighting", "Lights, lamps, and other lighting fixtures for interior decoration."),
        HOME_APPLIANCES("Home Appliances", "Large appliances used for household chores and living."),
        FURNITURE("Furniture", "Tables, chairs, and other furniture items for home and office."),
        BATHROOM_ACCESSORIES("Bathroom Accessories", "Items such as shower-heads, bathroom mirrors, etc."),
        OUTDOOR_FURNITURE("Outdoor Furniture", "Furniture for outdoor spaces like gardens and patios.");

        private final String label;
        private final String description;


    }




