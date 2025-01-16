package ecommerce_design_interior.repositories.dataAccessAbstracts;

import ecommerce_design_interior.entities.users.client.BookAMeeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookAMeetingRepository extends JpaRepository<BookAMeeting,Long> {}
