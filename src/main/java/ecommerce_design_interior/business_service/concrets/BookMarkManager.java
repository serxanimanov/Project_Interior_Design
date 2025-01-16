package ecommerce_design_interior.business_service.concrets;

import ecommerce_design_interior.business_service.abstracts.BookMark;
import ecommerce_design_interior.business_service.business_rules.BookMarkBusinessRules;
import ecommerce_design_interior.business_service.dtos.responses.BookMarkResponseDto;
import ecommerce_design_interior.mappers.ModelMapperService;
import ecommerce_design_interior.repositories.dataAccessAbstracts.BookMarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookMarkManager implements BookMark {

    private final ModelMapperService modelMapperService;
    private final BookMarkRepository bookMarkRepository;
    private final BookMarkBusinessRules bookMarkBusinessRules;

    @Override
    public List<BookMarkResponseDto> getAllBookMarks() {
        return List.of();
    }
}
