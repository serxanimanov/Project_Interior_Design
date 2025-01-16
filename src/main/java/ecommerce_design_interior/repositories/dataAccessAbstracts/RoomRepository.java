package ecommerce_design_interior.repositories.dataAccessAbstracts;

import ecommerce_design_interior.entities.products.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<RoomEntity,Long> {


 }
