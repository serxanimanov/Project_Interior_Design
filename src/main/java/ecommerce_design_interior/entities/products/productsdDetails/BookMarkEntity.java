package ecommerce_design_interior.entities.products.productsdDetails;


import ecommerce_design_interior.entities.products.ItemEntity;
import ecommerce_design_interior.entities.products.RoomEntity;
import ecommerce_design_interior.entities.users.UserEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "book_marks")
public class BookMarkEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private UserEntity userEntity;

    @ManyToMany
    @JoinTable(name = "bookmarked_rooms",
            joinColumns = @JoinColumn(name = "bookmark_id"),
            inverseJoinColumns = @JoinColumn(name = "room_id"))
    private List<RoomEntity> roomEntityList;

    @ManyToMany
    @JoinTable(name = "bookmarked_items",
            joinColumns = @JoinColumn(name = "bookmark_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id"))
    private List<ItemEntity> itemEntityList;


}
