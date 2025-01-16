package ecommerce_design_interior.business_service.concrets;

import ecommerce_design_interior.business_service.abstracts.Items;
import ecommerce_design_interior.business_service.business_rules.ItemBusinessRules;
import ecommerce_design_interior.business_service.dtos.responses.ItemResponseDto;
import ecommerce_design_interior.mappers.ModelMapperService;
import ecommerce_design_interior.repositories.dataAccessAbstracts.ItemRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ItemManager  implements Items {

    private final ModelMapperService modelMapperService;
    private final ItemRepository itemRepository;
    private final ItemBusinessRules itemBusinessRules;


    @Override
    public List<ItemResponseDto> getAllItems() {
        return List.of();
    }
}
