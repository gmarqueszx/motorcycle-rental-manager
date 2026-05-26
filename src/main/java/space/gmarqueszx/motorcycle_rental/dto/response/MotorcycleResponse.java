package space.gmarqueszx.motorcycle_rental.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MotorcycleResponse {
    private Long id;
    private Integer year;
    private String model;
    private String licensePlate;
    private Boolean available;
}