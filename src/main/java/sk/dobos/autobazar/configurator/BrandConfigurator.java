package sk.dobos.autobazar.configurator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import sk.dobos.autobazar.models.Brand;
import sk.dobos.autobazar.services.BrandService;
import sk.dobos.autobazar.services.implementations.AudiServiceImplementation;
import sk.dobos.autobazar.services.implementations.BrandServiceFactory;

@Configuration
public class BrandConfigurator {

    @Bean
    public BrandServiceFactory createFactory(){
        return new BrandServiceFactory();
    }

    @Bean
    @Profile("audisi")
    public BrandService audi(BrandServiceFactory brandServiceFactory){
        return brandServiceFactory.createBrandService("audi");
    }

    @Bean
    @Primary
    @Profile("bmwsi")
    public BrandService bmw(BrandServiceFactory brandServiceFactory){
        return brandServiceFactory.createBrandService("bmw");
    }

    @Bean
    @Profile("mbsi")
    public BrandService mb(BrandServiceFactory brandServiceFactory){
        return brandServiceFactory.createBrandService("mbsi");
    }
}
