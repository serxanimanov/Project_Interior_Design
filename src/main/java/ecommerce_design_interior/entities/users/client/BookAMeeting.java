package ecommerce_design_interior.entities.users.client;

import ecommerce_design_interior.enums.EnquiryTypeEnum;
import ecommerce_design_interior.enums.MeetingTypeEenum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
@Table(name = "book_a_meeting")
public class BookAMeeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable = false,unique = true)
    private String phoneNumber;
    private String Region;

    @Enumerated(EnumType.STRING)
    private EnquiryTypeEnum enquiryTypeEnum;

    @Enumerated(EnumType.STRING)
    private MeetingTypeEenum meetingType;


}
