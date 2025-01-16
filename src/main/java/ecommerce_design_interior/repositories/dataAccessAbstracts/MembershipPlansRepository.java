package ecommerce_design_interior.repositories.dataAccessAbstracts;

import ecommerce_design_interior.entities.users.client.MembershipPlansEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MembershipPlansRepository extends JpaRepository<MembershipPlansEntity,Long> {

    //Optional<MembershipPlansEntity> findById();
}
