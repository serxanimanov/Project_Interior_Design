package ecommerce_design_interior.repositories.dataAccessAbstracts;

import ecommerce_design_interior.entities.users.client.MembershipEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MembershipRepository extends JpaRepository<MembershipEntity,Long> {

    Optional<MembershipEntity> findByUserId_IdAndIsActiveTrue(Long userId);
    List<MembershipEntity> findAllByIsActiveTrue();

}
