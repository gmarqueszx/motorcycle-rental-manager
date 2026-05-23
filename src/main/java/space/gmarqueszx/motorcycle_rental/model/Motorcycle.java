package space.gmarqueszx.motorcycle_rental.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "motorcycle")
public class Motorcycle {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "motorcycle_seq")
    @SequenceGenerator(name = "motorcycle_seq", sequenceName = "motorcycle_sequence", allocationSize = 50)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(nullable = false)
    private Integer year;

    @Column(nullable = false)
    private String model;

    @Column(name = "license_plate", unique = true, nullable = false)
    private String licensePlate;

    private Boolean available;
}
