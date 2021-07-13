package sk.dobos.autobazar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sk.dobos.autobazar.services.CarServices;

@Component
public class AppRun {

    @Autowired
    CarServices carServices;

    //autowired
    /*
    public AppRun(CarServices carServices) {
        this.carServices = carServices;
    }
     */


    public void run() {

        carServices.createAndAddCar();
    }
}
