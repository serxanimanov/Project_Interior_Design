package ecommerce_design_interior.business_service.abstracts;

import ecommerce_design_interior.business_service.dtos.responses.BookAMeetingResponseDto;

import java.util.List;

public interface BookAMeetingService {

   List<BookAMeetingResponseDto> getAllBookedMeetings();

}
