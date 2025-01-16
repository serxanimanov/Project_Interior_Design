package ecommerce_design_interior.entities.users.client;

import ecommerce_design_interior.configurations.payment.paymentEntity.StripeEntity;
import ecommerce_design_interior.entities.users.UserEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

    @Entity
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Table(name = "membership_plan")
    public class MembershipEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        .//@Enumerated(EnumType.STRING)
        private MembershipPlansEntity planType; //planName

        private Double pricePerDays; //monthlyPrice

        @Column(nullable = false)
        private Integer durationInDays; // plan duration

        //@Column(nullable = false)
        private boolean isActive; // Plan aktif mi pasif mi?

        @ElementCollection
        @CollectionTable(name = "membership_features", joinColumns = @JoinColumn(name = "membership_id"))
        @Column(name = "feature")
        private List<String> features;

        //private boolean isActive; // plan active or de active todo bunu sonradan bagladim

        @OneToMany(mappedBy = "membershipPlan",cascade = CascadeType.ALL) // relation for user and dev for open or close plan
        private List<UserEntity> userId;// todo bunu listden singla kecirmisem

        @OneToMany(mappedBy = "membershipPlan", cascade = CascadeType.ALL)
        private List<StripeEntity> payments; // this is for who did what

        //todo date ola biler
        }





