package ecommerce_design_interior.business_service.abstracts;

import ecommerce_design_interior.business_service.dtos.responses.FooterResponseDto;

import java.util.List;

public interface FooterService {

    List<FooterResponseDto> getAllFooterInfo();

}
