package sk.dobos.autobazar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import sk.dobos.autobazar.models.Car;
import sk.dobos.autobazar.models.dto.CarDTO;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByName(String type);


}
