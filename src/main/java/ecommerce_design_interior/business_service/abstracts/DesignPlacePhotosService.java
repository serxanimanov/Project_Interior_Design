package ecommerce_design_interior.business_service.abstracts;

import ecommerce_design_interior.business_service.dtos.responses.DesignPlacePhotosResponseDto;

import java.util.List;

public interface DesignPlacePhotosService {

    List<DesignPlacePhotosResponseDto> getAllDesignPhotos();

}
