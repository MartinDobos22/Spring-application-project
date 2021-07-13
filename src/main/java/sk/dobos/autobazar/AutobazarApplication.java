package sk.dobos.autobazar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import sk.carmodel.ModelsOfCars;
import sk.dobos.autobazar.services.BrandService;
import sk.dobos.autobazar.services.RestApiService;
import sk.dobos.autobazar.services.implementations.BrandServiceFactory;


@SpringBootApplication
public class AutobazarApplication {

	public static void main(String[] args) {

	//	SpringApplication.run(AutobazarApplication.class,args);

		/*
		ApplicationContext context = SpringApplication.run(AutobazarApplication.class, args);
		AppRun appRun = context.getBean(AppRun.class);
		appRun.run();
		 */

//		ApplicationContext context2 = SpringApplication.run(AutobazarApplication.class, args);
//		AppRun2 appRun2 = context2.getBean(AppRun2.class);
//		appRun2.run();

//		ApplicationContext context3  = SpringApplication.run(AutobazarApplication.class, args);
//		context3.getBean(BrandService.class).giveMeBrandofCar();


		ApplicationContext context4  = SpringApplication.run(AutobazarApplication.class, args);
		System.out.println(context4.getBean(RestApiService.class).getTodo(1L));

	}
}
