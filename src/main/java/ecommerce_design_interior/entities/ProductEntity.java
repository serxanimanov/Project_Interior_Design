//package ecommerce_design_interior.entities;
//
//import ecommerce_design_interior.entities.products.ItemEntity;
//import ecommerce_design_interior.entities.products.RoomEntity;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.extern.slf4j.Slf4j;
//
//import java.util.List;
//
//@Slf4j
//@Entity
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@Table(name = "product_entity")
//public class ProductEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "product_items",
//            joinColumns = @JoinColumn(name = "product_id"),
//            inverseJoinColumns = @JoinColumn(name = "item_id"))
//    private List<ItemEntity> itemEntityList;
//
////    @Enumerated(EnumType.STRING)//todo fikirlesmek lazimdir
////    private String productCategory;
//
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(
//            name = "product_room",
//            joinColumns = @JoinColumn(name = "product_id"),
//            inverseJoinColumns = @JoinColumn(name = "room_id")
//    )
//    private List<RoomEntity> roomEntityList;
//
//
//    //private List<InspirationsEntity> inspirationsEntityList;// todo maybe i can add this first to RoomEntity
//
//
//}
