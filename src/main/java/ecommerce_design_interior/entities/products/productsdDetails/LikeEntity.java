package ecommerce_design_interior.entities.products.productsdDetails;

import ecommerce_design_interior.entities.products.AllMediaByDesignersEntity;
import ecommerce_design_interior.entities.products.RoomEntity;
import ecommerce_design_interior.entities.users.DesignerProfile;
import ecommerce_design_interior.entities.users.UserEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "likes")
public class LikeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long likeCount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id", nullable = false)
    private RoomEntity roomEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "designer_id")
    private DesignerProfile designerProfile;//todo buna aid olan dtolara baxmaq

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "media_id")
    private AllMediaByDesignersEntity allMediaByDesignersEntity;


    //    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "item_id", nullable = false)
//    private ItemEntity item;


//    @Column(name = "created_at", nullable = false)// todo it should be declare in service lay
//    private LocalDateTime createdAt= LocalDateTime.now();


}
