package ecommerce_design_interior.business_service.dtos.responses;

import ecommerce_design_interior.business_service.dtos.responses.innerResponseDtos.ItemDetailsDtoForBookMark;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookMarkResponseDto {

    private Long id;
    private Long userId;
    // todo burada productlarin id si ola biler ve ya baska birsey deqiqlesdirmek lazimdir
    private List<RoomResponseDto> roomDtoForBookMarks;
    private List<ItemDetailsDtoForBookMark> itemDtoForBookMarks;

}
