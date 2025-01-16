package ecommerce_design_interior.entities.products.productsdDetails;


import ecommerce_design_interior.entities.products.RoomEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Entity
@Getter
@Setter
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "design_name")
public class DesignNameEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String designNames;

    @OneToOne(fetch = FetchType.LAZY)// todo : ask for one to one
    @JoinColumn(name = "room_id")
    private RoomEntity roomEntityDesignName;

    //@ManyToOne(?)
    // private ItemEntity itemEntityDesignName;


}
