package sk.dobos.autobazar.services.implementations;

import org.springframework.stereotype.Service;
import sk.dobos.autobazar.services.BrandService;

public class AudiServiceImplementation implements BrandService {


    @Override
    public void giveMeBrandofCar() {
        System.out.println("This is audi service implementation");
    }
}
