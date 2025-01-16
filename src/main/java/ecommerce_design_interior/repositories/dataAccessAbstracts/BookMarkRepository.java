package ecommerce_design_interior.repositories.dataAccessAbstracts;

import ecommerce_design_interior.entities.products.productsdDetails.BookMarkEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface   BookMarkRepository extends JpaRepository<BookMarkEntity,Long> {}
