package sk.dobos.autobazar.services.implementations;

import org.springframework.stereotype.Service;
import sk.dobos.autobazar.mappers.CarMapper;
import sk.dobos.autobazar.models.Car;
import sk.dobos.autobazar.models.dto.CarDTO;
import sk.dobos.autobazar.repositories.CarRepository;
import sk.dobos.autobazar.services.CarServices;

import java.util.List;
import java.util.stream.Collectors;

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
        return carRepository.findAll().
                             stream().
                             map(car -> carMapper.carToCarDto(car)).
                             collect(Collectors.toList());
    }

    @Override
    public List<CarDTO> findCarByName(String type) {
        return carRepository.findByType(type).stream().map(car -> carMapper.carToCarDto(car)).collect(Collectors.toList());

    }

    @Override
    public CarDTO addCar(CarDTO carDTO) {
        return carMapper.carToCarDto(carRepository.save(carMapper.carDtoToCar(carDTO)));
    }

    public CarDTO updateCar(CarDTO carDTO, long carId) {
       return carMapper.carToCarDto(carRepository.findById(carId).map(car -> {
                                            car.setType(carDTO.getType());
                                            car.setBrands(carDTO.getBrandsOfTheCar());
                                            return carRepository.save(car);
            }

        ).orElseGet(() -> {
            carDTO.setId(carId);
            return carRepository.save(carMapper.carDtoToCar(carDTO));
            }
        )
       );
    }

    @Override
    public void deleteMovie(long id) {
        carRepository.deleteById(id);
    }
}
