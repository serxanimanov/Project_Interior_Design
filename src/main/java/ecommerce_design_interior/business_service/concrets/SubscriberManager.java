package ecommerce_design_interior.business_service.concrets;

import ecommerce_design_interior.business_service.abstracts.SubscriberService;
import ecommerce_design_interior.business_service.business_rules.SubscriberBusinessRules;
import ecommerce_design_interior.business_service.dtos.responses.SubscriberResponseDto;
import ecommerce_design_interior.mappers.ModelMapperService;
import ecommerce_design_interior.repositories.dataAccessAbstracts.SubscriberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubscriberManager implements SubscriberService {

    private final ModelMapperService modelMapperService;
    private final SubscriberRepository subscriberRepository;
    private final SubscriberBusinessRules subscriberBusinessRules;

    @Override
    public List<SubscriberResponseDto> getAllSubscribers() {
        return List.of();
    }
}
