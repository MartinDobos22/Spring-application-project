package sk.dobos.autobazar.services.implementations;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sk.dobos.autobazar.services.BrandService;

//@Service
public class MercedesServiceImplementation implements BrandService {
    @Override
    public void giveMeBrandofCar() {
        System.out.println("This is mercedes benz service implementation");
    }
}
