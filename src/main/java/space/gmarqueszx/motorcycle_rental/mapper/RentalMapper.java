package space.gmarqueszx.motorcycle_rental.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import space.gmarqueszx.motorcycle_rental.dto.response.RentalResponse;
import space.gmarqueszx.motorcycle_rental.model.Rental;

@Mapper(componentModel = "spring")
public interface RentalMapper {

    @Mapping(target = "motorcycleId", source = "motorcycle.id")
    @Mapping(target = "deliverymanId", source = "deliveryman.id")
    @Mapping(target = "totalCost", ignore = true)
    RentalResponse toResponse(Rental rental);
}