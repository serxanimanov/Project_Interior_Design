package ecommerce_design_interior.business_service.dtos.responses;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TagResponseDto {

    private Long id;
    @Size
    private String tagName;
    private List<RoomResponseDto> tagsResponseWithRoom;

}
