package ecommerce_design_interior.entities.products;

import ecommerce_design_interior.entities.products.productsdDetails.DesignDescriptionEntity;
import ecommerce_design_interior.entities.users.DesignerProfile;
import ecommerce_design_interior.enums.ItemCategory;
import ecommerce_design_interior.enums.MakingItemTypeEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "item_entity")
public class ItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemName;
    private String itemColor;

    @Enumerated(EnumType.STRING)
    private ItemCategory itemCategory;

    @OneToMany(mappedBy = "itemEntity", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<DesignDescriptionEntity> designDescriptions;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "designer_id")
    private DesignerProfile designerName;

    private String itemSerialCode;
    private String itemDimension;// todo

    private List<String> itemPhotos;
    private Integer itemQuantity;

    @Enumerated(EnumType.STRING)
    // @Column(columnDefinition = "varchar(255)")
    private MakingItemTypeEnum makingType;

    private String itemMaterialType;
    private BigDecimal itemPrice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id")
    private RoomEntity roomEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cart_id")
    private CartEntity cartEntity;

    private Long stock;//todo for admin panel.
//todo : use it in item details






//    @OneToMany(mappedBy = "itemEntityList", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<TagsEntity> tagsEntityList;

//    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<LikeEntity> likes;
    // todo add to cart prosses
     //todo  selection isleri meselem reng

}
