package ecommerce_design_interior.business_service.abstracts;

import ecommerce_design_interior.business_service.dtos.responses.TagResponseDto;

import java.util.List;

public interface TagsService {

    List<TagResponseDto> getAllTags();

}
