package ecommerce_design_interior.business_service.concrets;

import ecommerce_design_interior.business_service.abstracts.DesignPlacePhotosService;
import ecommerce_design_interior.business_service.business_rules.DesignPlacePhotosBusinessRules;
import ecommerce_design_interior.business_service.dtos.responses.DesignPlacePhotosResponseDto;
import ecommerce_design_interior.mappers.ModelMapperService;
import ecommerce_design_interior.repositories.dataAccessAbstracts.DesignPlacePhotosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DesignPlacePhotosManager implements DesignPlacePhotosService {

    private final ModelMapperService modelMapperService;
    private final DesignPlacePhotosRepository designPlacePhotoRepository;
    private final DesignPlacePhotosBusinessRules designPlacePhotosBusinessRules;

    @Override
    public List<DesignPlacePhotosResponseDto> getAllDesignPhotos() {
        return List.of();
    }
}
