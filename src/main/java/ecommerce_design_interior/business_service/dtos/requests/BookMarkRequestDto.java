package ecommerce_design_interior.business_service.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookMarkRequestDto {


    private Long userId;
    private List<Long> roomIds;
    private List<Long> itemIds;

}
