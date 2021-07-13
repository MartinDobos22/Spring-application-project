package sk.carmodel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ModelsOfCars {
    private List<String> cars = new ArrayList<>();

    public ModelsOfCars() {
        this.cars = Arrays.asList("Audi A6", "Mercedes benz S500", "Bmw m5");
    }

    public String getCar(){
        Random random = new Random();
        int i = random.nextInt(cars.size());
        return cars.get(i);
    }
}
