package sk.dobos.autobazar.services.implementations;

import org.springframework.stereotype.Service;
import sk.dobos.autobazar.mappers.CarMapper;
import sk.dobos.autobazar.models.Car;
import sk.dobos.autobazar.models.dto.CarDTO;
import sk.dobos.autobazar.repositories.CarRepository;
import sk.dobos.autobazar.services.CarServices;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImplementation implements CarServices {

    CarRepository carRepository;
    CarMapper carMapper;

    public CarServiceImplementation(CarRepository carRepository, CarMapper carMapper) {
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }

    @Override
    public Car createAndAddCar() {
        Car car2 = new Car();
        car2.setType("M6");

        return carRepository.save(car2);
    }

    @Override
    public CarDTO getCarById(Long id) {
        return carMapper.carToCarDto( carRepository.findById(id).orElse(null));
    }

    @Override
    public List<CarDTO> getAllCars() {
        return null;
    }

    @Override
    public CarDTO findCarByName(String type) {
        return null;
    }
}
