package space.gmarqueszx.motorcycle_rental.dto.response;

import lombok.Builder;
import lombok.Getter;
import space.gmarqueszx.motorcycle_rental.model.CnhType;

import java.time.LocalDate;

@Getter
@Builder
public class DeliverymanResponse {
    private Long id;
    private String name;
    private String cpf;
    private LocalDate dateOfBirth;
    private String cnhNumber;
    private CnhType cnhType;
    private String cnhImageUrl;
}