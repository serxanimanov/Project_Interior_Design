package ecommerce_design_interior.business_service.concrets;

import ecommerce_design_interior.business_service.abstracts.AllMediaService;
import ecommerce_design_interior.business_service.business_rules.AllMediaBusinessRules;
import ecommerce_design_interior.business_service.dtos.responses.AllMediaResponseDto;
import ecommerce_design_interior.mappers.ModelMapperService;
import ecommerce_design_interior.repositories.dataAccessAbstracts.AllMediaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AllMediaManager implements AllMediaService {

    private final ModelMapperService modelMapperService;
    private final AllMediaRepository allMediaRepository;
    private final AllMediaBusinessRules allMediaBusinessRules;

    @Override
    public List<AllMediaResponseDto> getAllMedia() {
        return List.of();
    }
}
