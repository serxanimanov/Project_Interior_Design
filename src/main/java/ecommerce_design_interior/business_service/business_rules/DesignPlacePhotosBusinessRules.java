package ecommerce_design_interior.business_service.business_rules;

import ecommerce_design_interior.repositories.dataAccessAbstracts.DesignPlacePhotosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DesignPlacePhotosBusinessRules {

    private final DesignPlacePhotosRepository designPlacePhotosRepository;
}
