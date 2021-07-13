package sk.dobos.autobazar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import sk.dobos.autobazar.models.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}
