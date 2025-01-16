package ecommerce_design_interior.entities.products.productsdDetails;


import ecommerce_design_interior.entities.products.ItemEntity;
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
@Table(name = "design_description")
public class DesignDescriptionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String designDescription;

    @OneToOne(fetch =FetchType.LAZY)
    @JoinColumn(name = "room_id")// todo : ask
    private RoomEntity roomEntityDescription;

    @ManyToOne(fetch = FetchType.LAZY) // Her bir tasarım açıklaması birden fazla öğe tarafından paylaşılabilir
    @JoinColumn(name = "item_id", nullable = false) // Öğe ile ilişki
    private ItemEntity itemEntity;
//    @ManyToOne(?)
//    private ItemEntity itemEntityDescription;

}
