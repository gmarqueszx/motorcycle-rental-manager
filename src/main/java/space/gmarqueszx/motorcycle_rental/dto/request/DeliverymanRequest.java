package space.gmarqueszx.motorcycle_rental.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import space.gmarqueszx.motorcycle_rental.model.CnhType;

import java.time.LocalDate;

public record DeliverymanRequest(
        @NotBlank String name,
        @NotBlank String cpf,
        @NotNull @Past LocalDate dateOfBirth,
        @NotBlank String cnhNumber,
        @NotNull CnhType cnhType
) {
}