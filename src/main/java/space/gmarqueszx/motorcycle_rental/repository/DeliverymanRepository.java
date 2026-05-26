package space.gmarqueszx.motorcycle_rental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import space.gmarqueszx.motorcycle_rental.model.Deliveryman;

public interface DeliverymanRepository extends JpaRepository<Deliveryman, Long> {
    boolean existsByCpf(String cpf);
    boolean existsByCnhNumber(String cnhNumber);
}
