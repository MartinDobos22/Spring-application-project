package sk.dobos.autobazar.services.implementations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import sk.dobos.autobazar.services.BrandService;

//@Service
public class BmwServiceImplementation implements BrandService {
    @Override
    public void giveMeBrandofCar() {
        System.out.println("This is bmw service implementation");
    }
}
