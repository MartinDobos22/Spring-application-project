package sk.dobos.autobazar.restapi;


import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import sk.dobos.autobazar.models.Car;
import sk.dobos.autobazar.models.dto.CarDTO;
import sk.dobos.autobazar.restapi.CarRestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
/*
@Component
public class CarResourceAssembler implements ResourceAssembler<CarDTO, Resource<CarDTO>> {

    @Override
    public Resource<CarDTO> toResource(CarDTO carDTO){
        return new Resource<>(carDTO,
                linkTo(methodOn(CarRestController.class).getCarById(carId)).withSelfRel(),
                linkTo(methodOn(CarRestController.class).getCars("")).withRel("cars")
    }

}
*/