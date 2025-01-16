package ecommerce_design_interior.configurations.payment.paymentRepository;

import ecommerce_design_interior.configurations.payment.paymentEntity.StripeEntity;
import ecommerce_design_interior.entities.users.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StripeRepository extends JpaRepository<StripeEntity,Long> {

    List<StripeEntity> findByUser(UserEntity user);
    List<StripeEntity> findByUserId(Long userId);

}
