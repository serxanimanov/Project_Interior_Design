package ecommerce_design_interior.business_service.abstracts;

import ecommerce_design_interior.business_service.dtos.responses.MembershipResponseDto;

import java.util.List;

public interface MembershipService {

List<MembershipResponseDto> getAllMemberByPlan();

}
