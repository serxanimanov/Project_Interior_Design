package ecommerce_design_interior.entities.products;

import ecommerce_design_interior.entities.products.productsdDetails.LikeEntity;
import ecommerce_design_interior.entities.products.productsdDetails.TagsEntity;
import ecommerce_design_interior.entities.products.productsdDetails.DesignDescriptionEntity;
import ecommerce_design_interior.entities.products.productsdDetails.DesignNameEntity;
import ecommerce_design_interior.entities.products.productsdDetails.DesignPlacePhotosEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Entity
@Getter
@Setter
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "room_entity")
public class RoomEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "roomEntityDesign", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DesignPlacePhotosEntity> designPlacePhotos;

    @OneToMany(mappedBy = "roomEntityTags", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TagsEntity> tagsEntityList;

    @OneToOne(mappedBy = "roomEntityDescription", cascade = CascadeType.ALL, orphanRemoval = true)
    private DesignDescriptionEntity designDescriptionEntityList;//todo adindan listi sil

    @OneToOne(mappedBy = "roomEntityDesignName", cascade = CascadeType.ALL, orphanRemoval = true)
    private DesignNameEntity designName;

    @OneToMany(mappedBy = "roomEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemEntity> itemEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cart_id", nullable = false)
    private CartEntity cartEntity; // Room belongs to a single cart.

    @OneToMany(mappedBy = "roomEntity", cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.LAZY)
    private List<LikeEntity> likes;








//    @ManyToMany(mappedBy = "roomEntityList")
//    private List<ProductEntity> productEntities;

    //private LocalDateTime creatingTime = LocalDateTime.now();//todo it should be declared in service lay
    //private String roomDescriptionCategory;

//    @OneToMany(mappedBy = "roomEntity", cascade = CascadeType.ALL, orphanRemoval = true,fetch =FetchType.LAZY )
//    private List<InspirationsEntity> inspirations;//todo : bunu  sonradan sildim
}