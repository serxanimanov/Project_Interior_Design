package ecommerce_design_interior.business_service.business_rules;

import ecommerce_design_interior.repositories.dataAccessAbstracts.BookAMeetingRepository;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@RequiredArgsConstructor
public class BookAMeetingBusinessRules {


  private  final BookAMeetingRepository bookAMeetingRepository;
}
