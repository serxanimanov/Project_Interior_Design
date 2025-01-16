package ecommerce_design_interior.business_service.abstracts;

import ecommerce_design_interior.business_service.dtos.responses.ItemResponseDto;

import java.util.List;

public interface Items {

    List <ItemResponseDto> getAllItems();
}
