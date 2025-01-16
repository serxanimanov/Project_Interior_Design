package ecommerce_design_interior.business_service.concrets;

import ecommerce_design_interior.business_service.abstracts.UserService;
import ecommerce_design_interior.business_service.business_rules.UserBusinessRules;
import ecommerce_design_interior.business_service.dtos.responses.UserResponseDto;
import ecommerce_design_interior.mappers.ModelMapperService;
import ecommerce_design_interior.repositories.dataAccessAbstracts.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserManager implements UserService {

    private final ModelMapperService modelMapperService;
    private final UserRepository userRepository;
    private final UserBusinessRules userBusinessRules;

    @Override
    public List<UserResponseDto> getAllUsers() {
        return List.of();
    }
}
