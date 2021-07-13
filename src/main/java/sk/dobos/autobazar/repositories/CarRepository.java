package sk.dobos.autobazar.repositories;

import org.springframework.data.repository.CrudRepository;
import sk.dobos.autobazar.models.Car;

public interface CarRepository extends CrudRepository<Car, Long> {
}
