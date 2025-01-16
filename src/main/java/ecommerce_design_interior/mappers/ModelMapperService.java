package ecommerce_design_interior.mappers;

import org.modelmapper.ModelMapper;

public interface ModelMapperService {

    ModelMapper forResponse();

    ModelMapper forRequest();


}
