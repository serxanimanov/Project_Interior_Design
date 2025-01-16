package ecommerce_design_interior.repositories.dataAccessAbstracts;

import ecommerce_design_interior.entities.products.InspirationsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InspirationRepository extends JpaRepository<InspirationsEntity,Long> {}
