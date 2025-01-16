package ecommerce_design_interior.business_service.concrets;

import ecommerce_design_interior.business_service.abstracts.MembershipService;
import ecommerce_design_interior.business_service.business_rules.MembershipBusinessRules;
import ecommerce_design_interior.business_service.dtos.responses.MembershipResponseDto;
import ecommerce_design_interior.mappers.ModelMapperService;
import ecommerce_design_interior.repositories.dataAccessAbstracts.MembershipRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MembershipManager implements MembershipService {


    private final ModelMapperService modelMapperService;
    private final MembershipRepository membershipRepository;
    private final MembershipBusinessRules membershipBusinessRules;


    @Override
    public List<MembershipResponseDto> getAllMemberByPlan() {
        return List.of();
    }
}
