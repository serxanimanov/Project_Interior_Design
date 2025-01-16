package ecommerce_design_interior.repositories.dataAccessAbstracts;

import ecommerce_design_interior.entities.products.AllMediaByDesignersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AllMediaRepository extends JpaRepository<AllMediaByDesignersEntity,Long> {}
