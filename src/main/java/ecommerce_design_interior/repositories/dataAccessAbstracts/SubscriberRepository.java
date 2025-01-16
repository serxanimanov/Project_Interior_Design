package ecommerce_design_interior.repositories.dataAccessAbstracts;

import ecommerce_design_interior.entities.users.client.SubscriberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriberRepository extends JpaRepository<SubscriberEntity,Long> {}
