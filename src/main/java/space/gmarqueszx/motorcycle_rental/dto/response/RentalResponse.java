package space.gmarqueszx.motorcycle_rental.dto.response;

import lombok.Builder;
import lombok.Getter;
import space.gmarqueszx.motorcycle_rental.model.RentalPlan;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Getter
@Builder
public class RentalResponse {
    private Long id;
    private Long motorcycleId;
    private Long deliverymanId;
    private OffsetDateTime contractDate;
    private OffsetDateTime rentalStart;
    private OffsetDateTime expectedEnd;
    private OffsetDateTime returnDate;
    private RentalPlan rentalPlan;
    private BigDecimal totalCost;
}