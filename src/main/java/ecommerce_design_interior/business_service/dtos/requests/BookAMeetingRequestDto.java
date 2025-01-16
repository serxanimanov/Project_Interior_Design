package ecommerce_design_interior.business_service.dtos.requests;

import ecommerce_design_interior.enums.EnquiryTypeEnum;
import ecommerce_design_interior.enums.MeetingTypeEenum;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookAMeetingRequestDto {

    @Size
    private String firstName;
    private String lastName;
    @Email
    private String email;
    private String phoneNumber;
    private String region;
    private EnquiryTypeEnum enquiryTypeEnum;
    private MeetingTypeEenum meetingType;

}
