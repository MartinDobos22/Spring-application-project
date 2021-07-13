package sk.dobos.autobazar.mappers;

import org.junit.jupiter.api.Test;
import sk.dobos.autobazar.models.Car;
import sk.dobos.autobazar.models.dto.CarDTO;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CarMapperTest {
    @Test
    public void carToCarDTOisSame(){
        Car car = new Car();
        car.setType("M4");
        car.setId(98L);
        Set<String> set = new HashSet<>();
        set.add("bmw");

        CarDTO carDTO = CarMapper.INSTANCE.carToCarDto(car);

        assertEquals(car.getId(), carDTO.getId());
        assertEquals(car.getType(), carDTO.getType());
        assertArrayEquals(car.getBrands().toArray(), carDTO.getBrandsOfTheCar().toArray());
    }

}