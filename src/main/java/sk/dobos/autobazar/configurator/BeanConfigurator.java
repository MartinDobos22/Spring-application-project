package sk.dobos.autobazar.configurator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sk.carmodel.ModelsOfCars;

@Configuration
public class BeanConfigurator {

    @Bean
    public ModelsOfCars getCar(){
        return new ModelsOfCars();
    }

}
