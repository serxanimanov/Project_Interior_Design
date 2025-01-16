package ecommerce_design_interior.repositories.dataAccessAbstracts;

import ecommerce_design_interior.entities.products.productsdDetails.TagsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagsRepository extends JpaRepository<TagsEntity,Long> {

}
