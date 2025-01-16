package ecommerce_design_interior.business_service.concrets;

import ecommerce_design_interior.business_service.abstracts.FooterService;
import ecommerce_design_interior.business_service.business_rules.FooterBusinessRules;
import ecommerce_design_interior.business_service.dtos.responses.FooterResponseDto;
import ecommerce_design_interior.mappers.ModelMapperService;
import ecommerce_design_interior.repositories.dataAccessAbstracts.FooterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FooterManager implements FooterService {

    private final ModelMapperService modelMapperService;
    private final FooterRepository FooterRepository;
    private final FooterBusinessRules footerBusinessRules;


    @Override
    public List<FooterResponseDto> getAllFooterInfo() {
        return List.of();
    }
}
