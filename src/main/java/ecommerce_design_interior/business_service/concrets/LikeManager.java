package ecommerce_design_interior.business_service.concrets;

import ecommerce_design_interior.business_service.abstracts.LikeService;
import ecommerce_design_interior.business_service.business_rules.LikeBusinessRules;
import ecommerce_design_interior.business_service.dtos.responses.LikeResponseDto;
import ecommerce_design_interior.mappers.ModelMapperService;
import ecommerce_design_interior.repositories.dataAccessAbstracts.LikeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LikeManager implements LikeService {

    private final ModelMapperService modelMapperService;
    private final LikeRepository likeRepository;
    private final LikeBusinessRules likeBusinessRules;


    @Override
    public List<LikeResponseDto> getAllLiked() {
        return List.of();
    }
}
