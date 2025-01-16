package ecommerce_design_interior.business_service.concrets;

import ecommerce_design_interior.business_service.abstracts.RoomService;
import ecommerce_design_interior.business_service.business_rules.RoomBusinessRules;
import ecommerce_design_interior.business_service.dtos.responses.RoomResponseDto;
import ecommerce_design_interior.mappers.ModelMapperService;
import ecommerce_design_interior.repositories.dataAccessAbstracts.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomManager implements RoomService {

    private final ModelMapperService modelMapperService;
    private final RoomRepository roomRepository;
    private final RoomBusinessRules roomBusinessRules;

    @Override
    public List<RoomResponseDto> getAllRooms() {
        return List.of();
    }
}
