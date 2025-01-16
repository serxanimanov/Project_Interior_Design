package ecommerce_design_interior.entities.products;

import ecommerce_design_interior.entities.products.productsdDetails.LikeEntity;
import ecommerce_design_interior.entities.users.DesignerProfile;
import ecommerce_design_interior.enums.AllMediaTypeEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "all_media")
public class AllMediaByDesignersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String designedObjectName;

    @ElementCollection
    @CollectionTable(name = "media_photos", joinColumns = @JoinColumn(name = "media_id"))
    @Column(name = "photo_url")
    private List<String> designedObjectPhoto;

    @Column(name = "designed_object_description", columnDefinition = "TEXT")
    private String getDesignedObjectDescription;

    @Column(name = "created_at", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Enumerated(EnumType.STRING)
    @Column(name = "media_type")
    private AllMediaTypeEnum allMediaTypeEnum;

    @OneToMany(mappedBy = "allMediaByDesignersEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<LikeEntity> likeCount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "designer_id")
    private DesignerProfile designerProfile;


//    @PrePersist
//    protected void onCreate() {
//        this.createdAt = new Date();// todo : created at in service lay;
//    }
}
