package sk.dobos.autobazar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sk.dobos.autobazar.repositories.CarRepository;

@Controller
public class CarController {

    CarRepository carRepository;

    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @RequestMapping("/cars")
    public String getCars(Model model){
         model.addAttribute("cars",carRepository.findAll());
         return "cars";
    }
}
