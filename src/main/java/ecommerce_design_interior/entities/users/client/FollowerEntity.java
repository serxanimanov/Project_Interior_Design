package ecommerce_design_interior.entities.users.client;

import ecommerce_design_interior.entities.users.DesignerProfile;
import ecommerce_design_interior.entities.users.UserEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FollowerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user; // Takip eden kullanıcı

    @ManyToOne
    @JoinColumn(name = "designer_id")
    private DesignerProfile designer; // Takip edilen tasarımcı
}
