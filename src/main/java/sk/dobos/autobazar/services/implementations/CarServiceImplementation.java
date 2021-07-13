package sk.dobos.autobazar.services.implementations;

import org.springframework.stereotype.Service;
import sk.dobos.autobazar.models.Car;
import sk.dobos.autobazar.repositories.CarRepository;
import sk.dobos.autobazar.services.CarServices;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImplementation implements CarServices {

    CarRepository carRepository;


    public CarServiceImplementation(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    //do db hodí len poslednú vytvorenú inštanciu auta
    public Iterable<Car> createAndAddCar() {
        Car car = new Car();
        car.setType("A6");
        Car car2 = new Car();
        car.setType("M6");
        Car car3 = new Car();
        car.setType("S560");

        List<Car> cars = Arrays.asList(car, car3, car2);
        return carRepository.saveAll(cars);
    }
}
