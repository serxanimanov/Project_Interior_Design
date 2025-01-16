package ecommerce_design_interior.business_service.abstracts;

import ecommerce_design_interior.business_service.dtos.responses.LikeResponseDto;

import java.util.List;

public interface LikeService {

    List<LikeResponseDto> getAllLiked();

}
