package ecommerce_design_interior.entities.users.client;

import ecommerce_design_interior.configurations.payment.paymentEntity.StripeEntity;
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
@Table(name = "membership_plans")
public class MembershipPlansEntity {
    //todo bu klasin dtosu yaradilmayib

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String planName;
    private Double priceOfPlan;

    @OneToOne(.)
    private StripeEntity stripeEntity;


}
