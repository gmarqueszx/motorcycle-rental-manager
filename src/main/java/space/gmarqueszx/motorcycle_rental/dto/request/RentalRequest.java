package space.gmarqueszx.motorcycle_rental.dto.request;

import jakarta.validation.constraints.NotNull;
import space.gmarqueszx.motorcycle_rental.model.RentalPlan;

public record RentalRequest(
        @NotNull Long motorcycleId,
        @NotNull Long deliverymanId,
        @NotNull RentalPlan rentalPlan
) {
}