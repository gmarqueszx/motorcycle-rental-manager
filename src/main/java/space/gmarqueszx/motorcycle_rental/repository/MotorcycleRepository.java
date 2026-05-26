package space.gmarqueszx.motorcycle_rental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import space.gmarqueszx.motorcycle_rental.model.Motorcycle;

import java.util.Optional;


public interface MotorcycleRepository extends JpaRepository<Motorcycle, Long> {
    Optional<Motorcycle> findByLicensePlate(String licensePlate);
    boolean existsByLicensePlate(String licensePlate);
}
