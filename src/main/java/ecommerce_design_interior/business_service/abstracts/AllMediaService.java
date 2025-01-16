package ecommerce_design_interior.business_service.abstracts;

import ecommerce_design_interior.business_service.dtos.responses.AllMediaResponseDto;

import java.util.List;

public interface AllMediaService {

    List<AllMediaResponseDto> getAllMedia();

}
