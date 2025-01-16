package ecommerce_design_interior.entities.products;

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
@Table(name = "inspirations")
public class InspirationsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private List<String> inspirationPhoto;

    private String inspirationDescription;

//    @ManyToOne(fetch = FetchType.LAZY)
//    private RoomEntity roomEntity;
}
