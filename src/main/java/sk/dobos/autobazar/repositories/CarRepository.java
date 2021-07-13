package sk.dobos.autobazar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.dobos.autobazar.models.Car;

import java.util.Collection;
import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {


   List<Car> findByType(String type);
}
