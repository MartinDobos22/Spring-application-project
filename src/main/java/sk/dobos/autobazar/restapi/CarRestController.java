package sk.dobos.autobazar.restapi;

import org.springframework.web.bind.annotation.*;
import sk.dobos.autobazar.models.Car;
import sk.dobos.autobazar.models.dto.CarDTO;
import sk.dobos.autobazar.repositories.CarRepository;
import sk.dobos.autobazar.services.CarServices;

import java.util.List;

//rest controller
@RestController
@RequestMapping("/restapi")
public class CarRestController {

    CarServices carServices;

    public CarRestController(CarServices carServices) {
        this.carServices = carServices;
    }

    @GetMapping("/cars")
    List<CarDTO> getCars(@RequestParam(required = false) String type){
        if(type != null && !type.isEmpty()){
            return carServices.findCarByName(type);
        }else {
            return carServices.getAllCars();
        }
    }


    @GetMapping("/car/{id}")
    CarDTO getCarById(@PathVariable("id") long carId) {
        return carServices.getCarById(carId);

    }
}
