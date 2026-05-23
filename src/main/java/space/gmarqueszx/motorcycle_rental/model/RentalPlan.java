package space.gmarqueszx.motorcycle_rental.model;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public enum RentalPlan {
    SEVEN_DAYS(7, BigDecimal.valueOf(30.00)),
    FIFTEEN_DAYS(15, BigDecimal.valueOf(28.00)),
    THIRTY_DAYS(30, BigDecimal.valueOf(22.00)),
    FORTY_FIVE_DAYS(45, BigDecimal.valueOf(20.00)),
    FIFTY_DAYS(50, BigDecimal.valueOf(18.00));

    private final int days;
    private final BigDecimal dailyRate;

    RentalPlan(int days, BigDecimal dailyRate) {
        this.days = days;
        this.dailyRate = dailyRate;
    }

    public BigDecimal totalCost() {
        return dailyRate.multiply(BigDecimal.valueOf(days));
    }
}
