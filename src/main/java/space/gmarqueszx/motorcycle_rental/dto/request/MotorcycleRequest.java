package space.gmarqueszx.motorcycle_rental.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

public record MotorcycleRequest(
        @NotNull @Positive Integer year,
        @NotBlank String model,
        @NotBlank @Pattern(regexp = "^[A-Z]{3}\\d[A-Z]\\d{2}$|^[A-Z]{3}\\d{4}$") String licensePlate
) {
}