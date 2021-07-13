package sk.dobos.autobazar.services.implementations;

import sk.dobos.autobazar.services.BrandService;

public class DefaultServiceImplementation implements BrandService {
    @Override
    public void giveMeBrandofCar() {
        System.out.println("This is default call of service implemenation");
    }
}
