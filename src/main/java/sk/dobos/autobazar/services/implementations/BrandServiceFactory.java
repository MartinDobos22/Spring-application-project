package sk.dobos.autobazar.services.implementations;

import sk.dobos.autobazar.services.BrandService;

public class BrandServiceFactory {

    public BrandService createBrandService(String car){
        switch (car){
            case "audi":
                return new AudiServiceImplementation();
            case "bmw":
                return new BmwServiceImplementation();
            case "mb":
                return new MercedesServiceImplementation();
            default:
                return new DefaultServiceImplementation();
        }
    }

}
