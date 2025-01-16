package ecommerce_design_interior.business_service.abstracts;

import ecommerce_design_interior.business_service.dtos.responses.RoomResponseDto;

import java.util.List;

public interface RoomService {

List<RoomResponseDto> getAllRooms();

}
