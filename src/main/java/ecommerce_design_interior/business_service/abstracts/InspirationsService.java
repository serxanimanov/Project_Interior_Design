package ecommerce_design_interior.business_service.abstracts;

import ecommerce_design_interior.business_service.dtos.responses.InspirationsResponseDto;

import java.util.List;

public interface InspirationsService {

    List<InspirationsResponseDto> getAllInspirations();

}
