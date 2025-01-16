package ecommerce_design_interior.configurations.payment.paymentEntity;

import ecommerce_design_interior.entities.users.UserEntity;
import ecommerce_design_interior.entities.users.client.MembershipPlansEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Setter
@Getter
@Slf4j
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "payments")
public class StripeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "payment_intent_id" ,unique = true)//unique idi
    private String paymentIntentId;
    private String status;
    private Long amount;

    @Column( length = 10)
    private String currency;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @CreationTimestamp
    @Column(name = "created_at",  updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "membership_plan_id")
    private MembershipPlansEntity membershipPlan;

}
