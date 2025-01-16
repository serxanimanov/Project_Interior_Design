package ecommerce_design_interior.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
@Table(name = "footer")
public class FooterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   // @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    //@JoinColumn(name = "about_us_id")
    private String aboutUs;

    private String blog;//todo blog can be entity just ask from frontend dev or Ai

    private String privacyPolicy;

    private String termsOfService;

    //todo private SupportEntity support;

}
