package space.gmarqueszx.motorcycle_rental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import space.gmarqueszx.motorcycle_rental.model.Rental;

public interface RentalRepository extends JpaRepository<Rental, Long> {
    boolean existsByMotorcycleId(Long motorcycleId);
}
