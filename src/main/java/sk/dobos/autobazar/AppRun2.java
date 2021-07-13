package sk.dobos.autobazar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import sk.dobos.autobazar.services.BrandService;

@Component
public class AppRun2 {

    @Autowired
  //  @Qualifier("audiServiceImplementation")
    BrandService brandService;

//    BrandService audiBrandServiceImplementation;

//    public AppRun2(@Qualifier("audiBrandServiceImplementation") BrandService brandService) {
//        this.brandService = brandService;
//    }

    public void run() {
        brandService.giveMeBrandofCar();
    }
}
