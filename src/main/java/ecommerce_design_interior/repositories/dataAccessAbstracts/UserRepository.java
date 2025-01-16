package ecommerce_design_interior.repositories.dataAccessAbstracts;

import ecommerce_design_interior.entities.users.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {





}
