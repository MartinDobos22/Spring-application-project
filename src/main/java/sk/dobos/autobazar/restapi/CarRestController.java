package sk.dobos.autobazar.restapi;

import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.*;
import sk.dobos.autobazar.models.Car;
import sk.dobos.autobazar.models.dto.CarDTO;
import sk.dobos.autobazar.repositories.CarRepository;
import sk.dobos.autobazar.services.CarServices;
//import org.springframework.hateoas.Resource;
//import org.springframework.hateoas.ResourceAssembler;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


//rest controller
@RestController
@RequestMapping("/restapi")
public class CarRestController {

    CarServices carServices;
    //CarResourceAssembler assembler;

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

/*
    @GetMapping("/cars/{id}")
    Resource<CarDTO> getCarById(@PathVariable("id") long carId) {
        CarDTO carDTO = carServices.getCarById(carId);
        return assembler.toResource(carDTO);
        );

    }
*/
    @PostMapping("/cars")
    CarDTO addCar(@RequestBody CarDTO carDTO){
        return carServices.addCar(carDTO);
    }

     @PutMapping("/cars/{id}")
        CarDTO updateCar(@RequestBody CarDTO carDTO, @PathVariable("id") long carId){
        return carServices.updateCar(carDTO, carId);
        }


    @DeleteMapping
    public void deleteMovie(long id){
        carServices.deleteMovie(id);
    }
}
