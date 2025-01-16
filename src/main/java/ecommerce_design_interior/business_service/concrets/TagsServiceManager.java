package ecommerce_design_interior.business_service.concrets;

import ecommerce_design_interior.business_service.abstracts.TagsService;
import ecommerce_design_interior.business_service.business_rules.TagsBusinessRules;
import ecommerce_design_interior.business_service.dtos.responses.TagResponseDto;
import ecommerce_design_interior.mappers.ModelMapperService;
import ecommerce_design_interior.repositories.dataAccessAbstracts.TagsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TagsServiceManager implements TagsService {

    private final ModelMapperService modelMapperService;
    private final TagsRepository tagsRepository;
    private final TagsBusinessRules tagsBusinessRules;


    @Override
    public List<TagResponseDto> getAllTags() {
        return List.of();
    }
}
