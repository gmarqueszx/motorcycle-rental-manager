package space.gmarqueszx.motorcycle_rental.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "rental")
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rental_seq")
    @SequenceGenerator(name = "rental_seq", sequenceName = "rental_sequence", allocationSize = 50)
    @EqualsAndHashCode.Include
    private Long id;

    @ManyToOne
    @JoinColumn(name = "motorcycle_id", nullable = false)
    private Motorcycle motorcycle;

    @ManyToOne
    @JoinColumn(name = "deliveryman_id", nullable = false)
    private Deliveryman deliveryman;

    @Column(name = "contract_date")
    private OffsetDateTime contractDate;

    @Column(name = "rental_start")
    private OffsetDateTime rentalStart;

    @Column(name = "expected_end")
    private OffsetDateTime expectedEnd;

    @Column(name = "return_date")
    private OffsetDateTime returnDate;

    @Column(name = "rental_plan")
    @Enumerated(EnumType.STRING)
    private RentalPlan rentalPlan;
}
