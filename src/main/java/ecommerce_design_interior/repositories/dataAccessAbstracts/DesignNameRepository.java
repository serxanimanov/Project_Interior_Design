package ecommerce_design_interior.repositories.dataAccessAbstracts;

import ecommerce_design_interior.entities.products.productsdDetails.DesignPlacePhotosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesignNameRepository extends JpaRepository<DesignPlacePhotosEntity,Long> {}