package ecommerce_design_interior.business_service.concrets;

import ecommerce_design_interior.business_service.abstracts.FollowerService;
import ecommerce_design_interior.business_service.business_rules.FollowerBusinessRules;
import ecommerce_design_interior.business_service.dtos.responses.FollowResponseDto;
import ecommerce_design_interior.mappers.ModelMapperService;
import ecommerce_design_interior.repositories.dataAccessAbstracts.FollowerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FollowerManager implements FollowerService {

    private final ModelMapperService modelMapperService;
    private final FollowerRepository followerRepository;
    private final FollowerBusinessRules followerBusinessRules;

    @Override
    public List<FollowResponseDto> getAllFollowers() {
        return List.of();
    }
}
