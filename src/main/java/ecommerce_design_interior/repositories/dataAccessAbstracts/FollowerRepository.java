package ecommerce_design_interior.repositories.dataAccessAbstracts;

import ecommerce_design_interior.entities.users.client.FollowerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowerRepository extends JpaRepository<FollowerEntity,Long> {



}
