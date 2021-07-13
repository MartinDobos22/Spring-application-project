package sk.dobos.autobazar.services.implementations;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sk.dobos.autobazar.models.Car;
import sk.dobos.autobazar.models.dto.CarDTO;
import sk.dobos.autobazar.services.CarServices;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class CarServiceImplementationTest {

    @Autowired
    CarServices carServices;

    @Test
    @Transactional
    void movieToServiceToDtoIsSame() {
        Car car = new Car();
        car.setType("A6");
        car.setId(10L);
//        Set<String> set = new HashSet<>();
//        set.add("bmw");

       CarDTO carDTO = carServices.getCarById(10L);

        assertEquals(car.getId(), carDTO.getId());
        assertEquals(car.getType(), carDTO.getType());
    }

    @Test
    @Transactional
    void carsFromServicesAreSame() {
        Car car1 = new Car();
        car1.setType("A6");
        car1.setId(10L);

        Car car2 = new Car();
        car2.setType("A6");
        car2.setId(11L);

        Set<Car> cars = new HashSet<>();
        cars.add(car1);
        cars.add(car2);

        List<CarDTO> carsDTOS = carServices.getAllCars();

        assertEquals(car1.getId(), carsDTOS.get(0).getId());
        assertEquals(car1.getType(), carsDTOS.get(0).getType());

        assertEquals(car2.getId(), carsDTOS.get(1).getId());
        assertEquals(car2.getType(), carsDTOS.get(1).getType());

    }

    @Test
    @Transactional
    void carFromDbIsA6() {
        List<CarDTO> carDTOS = carServices.findCarByName("A6");

        assertEquals(carDTOS.get(0).getType(), "A6");
        assertEquals(carDTOS.get(1).getType(), "A6");

    }
}