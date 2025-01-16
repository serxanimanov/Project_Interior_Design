package ecommerce_design_interior.business_service.abstracts;

import ecommerce_design_interior.business_service.dtos.responses.FollowResponseDto;

import java.util.List;

public interface FollowerService {

    List<FollowResponseDto> getAllFollowers();

}
