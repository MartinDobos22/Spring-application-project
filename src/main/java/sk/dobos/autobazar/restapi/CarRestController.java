package sk.dobos.autobazar.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.dobos.autobazar.models.Car;
import sk.dobos.autobazar.repositories.CarRepository;
import sk.dobos.autobazar.services.CarServices;

import java.util.List;

//rest controller
@RestController
@RequestMapping("/restapi")
public class CarRestController {

    CarRepository carRepository;

    public CarRestController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping("/listofcars")
    List<Car> allCars(){
        return carRepository.findAll();
    }


}
