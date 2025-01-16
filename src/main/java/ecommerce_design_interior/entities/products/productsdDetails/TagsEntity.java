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
@Table(name = "tags_entity")
public class TagsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tagName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id")
    private RoomEntity roomEntityTags;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "item_id")
//    private ItemEntity itemEntityList;
}
