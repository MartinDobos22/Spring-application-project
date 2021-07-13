package sk.dobos.autobazar.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import sk.dobos.autobazar.services.CarServices;

@Component
public class DataInit implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    CarServices carServices;

    public DataInit(CarServices carServices) {
        this.carServices = carServices;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        carServices.createAndAddCar();
        carServices.createAndAddCar();

    }
}
