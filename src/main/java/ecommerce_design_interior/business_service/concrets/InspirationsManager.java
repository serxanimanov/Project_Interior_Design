package ecommerce_design_interior.business_service.concrets;

import ecommerce_design_interior.business_service.abstracts.InspirationsService;
import ecommerce_design_interior.business_service.business_rules.InspirationsBusinessRules;
import ecommerce_design_interior.business_service.dtos.responses.InspirationsResponseDto;
import ecommerce_design_interior.mappers.ModelMapperService;
import ecommerce_design_interior.repositories.dataAccessAbstracts.InspirationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InspirationsManager implements InspirationsService {

    private final ModelMapperService modelMapperService;
    private final InspirationRepository inspirationRepository;
    private final InspirationsBusinessRules inspirationsBusinessRules;

    @Override
    public List<InspirationsResponseDto> getAllInspirations() {
        return List.of();
    }
}
