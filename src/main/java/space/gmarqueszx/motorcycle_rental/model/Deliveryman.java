package space.gmarqueszx.motorcycle_rental.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "deliveryman")
public class Deliveryman {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "deliveryman_seq")
    @SequenceGenerator(name = "deliveryman_seq", sequenceName = "deliveryman_sequence",
            allocationSize = 50)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(nullable = false)
    private String name;

    @CPF
    @Column(unique = true, nullable = false)
    private String cpf;

    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;

    @Column(name = "cnh_number", unique = true, nullable = false)
    private String cnhNumber;

    @Column(name = "cnh_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private CnhType cnhType;

    @Column(name = "cnh_image_url", nullable = false)
    private String cnhImageUrl;
}
