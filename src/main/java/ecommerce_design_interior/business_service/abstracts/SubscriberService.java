package ecommerce_design_interior.business_service.abstracts;

import ecommerce_design_interior.business_service.dtos.responses.SubscriberResponseDto;

import java.util.List;

public interface SubscriberService {

List<SubscriberResponseDto> getAllSubscribers();
}
