package ecommerce_design_interior.business_service.business_rules;

import ecommerce_design_interior.repositories.dataAccessAbstracts.BookMarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookMarkBusinessRules {

    private final BookMarkRepository bookMarkRepository;
}
