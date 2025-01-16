//package ecommerce_design_interior.entities;
//
//import jakarta.persistence.*;
//import jakarta.validation.constraints.Size;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.extern.slf4j.Slf4j;
//
//
//@Entity
//@Getter
//@Setter
//@Slf4j
//@NoArgsConstructor
//@AllArgsConstructor
//@Table(name = "about_us")
//public class AboutUsEntity {
//
//    @Id
//    @GeneratedValue
//    private Long id;
//
//    @Size(min = 1,max = 1000)
//    private String description;
//
//    @Size(min = 1,max = 1000)
//    private String logoDescription;
//
//    @OneToOne(mappedBy = "aboutUs", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private FooterEntity footer;
//
//}
