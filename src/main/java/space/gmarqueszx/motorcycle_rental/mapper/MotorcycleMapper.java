package space.gmarqueszx.motorcycle_rental.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import space.gmarqueszx.motorcycle_rental.dto.request.MotorcycleRequest;
import space.gmarqueszx.motorcycle_rental.dto.response.MotorcycleResponse;
import space.gmarqueszx.motorcycle_rental.model.Motorcycle;

@Mapper(componentModel = "spring")
public interface MotorcycleMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "available", ignore = true)
    Motorcycle toEntity(MotorcycleRequest request);

    MotorcycleResponse toResponse(Motorcycle motorcycle);
}