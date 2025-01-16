package ecommerce_design_interior.business_service.abstracts;

import ecommerce_design_interior.business_service.dtos.responses.BookMarkResponseDto;

import java.util.List;

public interface BookMark {

    List<BookMarkResponseDto> getAllBookMarks();

}
