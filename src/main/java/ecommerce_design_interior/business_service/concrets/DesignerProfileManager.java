package ecommerce_design_interior.business_service.concrets;

import ecommerce_design_interior.business_service.abstracts.DesignerProfileService;
import ecommerce_design_interior.business_service.business_rules.DesignerProfileBusinessRules;
import ecommerce_design_interior.business_service.dtos.responses.DesignerProfileResponse;
import ecommerce_design_interior.mappers.ModelMapperService;
import ecommerce_design_interior.repositories.dataAccessAbstracts.DesignerProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DesignerProfileManager implements DesignerProfileService {

    private final ModelMapperService modelMapperService;
    private final DesignerProfileRepository designerProfileRepository;
    private final DesignerProfileBusinessRules designerProfileBusinessRules;

    @Override
    public List<DesignerProfileResponse> allDesignersList() {
        return List.of();
    }
}
