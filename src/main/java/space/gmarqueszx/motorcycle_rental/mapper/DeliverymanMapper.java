package space.gmarqueszx.motorcycle_rental.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import space.gmarqueszx.motorcycle_rental.dto.request.DeliverymanRequest;
import space.gmarqueszx.motorcycle_rental.dto.response.DeliverymanResponse;
import space.gmarqueszx.motorcycle_rental.model.Deliveryman;

@Mapper(componentModel = "spring")
public interface DeliverymanMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "cnhImageUrl", ignore = true)
    Deliveryman toEntity(DeliverymanRequest request);

    DeliverymanResponse toResponse(Deliveryman deliveryman);
}