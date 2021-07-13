package sk.dobos.autobazar.services;


import sk.dobos.autobazar.models.Car;
import sk.dobos.autobazar.models.dto.CarDTO;

import java.util.List;

public interface CarServices {

    Car createAndAddCar();

    CarDTO getCarById(Long id);

    List<CarDTO> getAllCars();

    List<CarDTO> findCarByName(String type);

    CarDTO addCar(CarDTO carDTO);

    CarDTO updateCar(CarDTO carDTO, long carId);

    void deleteMovie(long id);
}
