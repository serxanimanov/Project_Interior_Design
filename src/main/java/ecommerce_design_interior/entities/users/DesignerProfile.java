package ecommerce_design_interior.entities.users;

import ecommerce_design_interior.entities.products.AllMediaByDesignersEntity;
import ecommerce_design_interior.entities.products.ItemEntity;
import ecommerce_design_interior.entities.products.productsdDetails.LikeEntity;
import ecommerce_design_interior.entities.users.client.FollowerEntity;
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
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
@Table(name = "designer_profile")
public class DesignerProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String profilePhoto;

    @OneToMany(mappedBy = "designerProfile", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<LikeEntity> likeEntity;

    @OneToMany(mappedBy = "designerName", fetch = FetchType.LAZY)
    List<ItemEntity> items;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @OneToMany(mappedBy = "designer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List <FollowerEntity> followerEntity;  //todo : bundan follower Count

    @OneToMany(mappedBy = "designerProfile", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AllMediaByDesignersEntity> allMediaByDesignersEntities;



    //private Integer likeCount;
    //private String bio;
    //private String firstNameDesigner;
    //private String lastNameDesigner;
    //todo  create new entity
    //private Long likesCount = 0L;//todo sorus

    //   @Temporal(TemporalType.TIMESTAMP)//todo doing from data base current time stamp for working truly
    //    private Date createdAt = new Date();// todo it should be declare in service lay

}
