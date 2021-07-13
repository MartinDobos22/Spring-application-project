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
    void getAllCars() {
    }

    @Test
    void findCarByName() {
    }
}