package sk.dobos.autobazar.configurator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:user.properties")
public class UserConfiguration {

    @Value("${user.name}")
    String name;
    @Value("${user.surname}")
    String surname;
}
