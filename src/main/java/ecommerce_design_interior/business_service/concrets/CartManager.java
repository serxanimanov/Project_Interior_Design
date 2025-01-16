package ecommerce_design_interior.business_service.concrets;

import ecommerce_design_interior.business_service.abstracts.CartService;
import ecommerce_design_interior.business_service.business_rules.CartBusinessRules;
import ecommerce_design_interior.business_service.dtos.responses.CartResponseDto;
import ecommerce_design_interior.mappers.ModelMapperService;
import ecommerce_design_interior.repositories.dataAccessAbstracts.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartManager implements CartService {

    private final ModelMapperService modelMapperService;
    private final CartRepository cartRepository;
    private final CartBusinessRules cartBusinessRules;

    @Override
    public List<CartResponseDto> allItemsInCart() {
        return List.of();
    }
}
