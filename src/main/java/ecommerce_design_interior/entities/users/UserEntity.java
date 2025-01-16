package ecommerce_design_interior.entities.users;

import ecommerce_design_interior.configurations.payment.paymentEntity.StripeEntity;
import ecommerce_design_interior.entities.products.CartEntity;
import ecommerce_design_interior.entities.products.productsdDetails.BookMarkEntity;
import ecommerce_design_interior.entities.products.productsdDetails.LikeEntity;
import ecommerce_design_interior.entities.users.client.MembershipEntity;
import ecommerce_design_interior.entities.users.client.SubscriberEntity;
import ecommerce_design_interior.enums.RolesEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String region;

    @NotNull(message = "Password is required")
    private String password;

    @Enumerated(EnumType.STRING)
    private RolesEnum role = RolesEnum.USER; // user role// todo i can did it dynamic

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "membership_id")
    private MembershipEntity membershipPlan;

    @Column(name = "membership_expiration_Date")
    private Date membershipExpirationDate; // date of ending user plan

    @OneToOne(mappedBy ="user",fetch = FetchType.LAZY)
    private DesignerProfile designerProfile;

    @OneToOne(mappedBy = "userEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private CartEntity cartEntity;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<LikeEntity> likes;

    @OneToMany(mappedBy = "userEntity", cascade = CascadeType.ALL, orphanRemoval = true)//  qarsi relationuna bax
    private List<BookMarkEntity> bookMarkEntity;

    @OneToMany(mappedBy = "userId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SubscriberEntity> subscriberEntity;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<StripeEntity> payments = new ArrayList<>();



    //    @Temporal(TemporalType.TIMESTAMP)//todo doing from data base current time stamp for working truly
    //    private Date createdAt = new Date(); // user register time// todo Created at should bu declared in service lay











//    public void setPassword(String rawPassword) {    // hashing password
//        this.password = new BCryptPasswordEncoder().encode(rawPassword);
//    }

//    public boolean hasActiveMembership() { // check user has upgraded plan or not
//        return this.membership != null &&
//                this.membershipExpirationDate != null &&
//                this.membershipExpirationDate.after(new Date());
//    }
//
//    public boolean isPremium() {//
//        return hasActiveMembership() && !this.membership.isFreePlan();
//    }


    }



