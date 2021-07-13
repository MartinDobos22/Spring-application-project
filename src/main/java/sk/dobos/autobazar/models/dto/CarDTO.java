package sk.dobos.autobazar.models.dto;

import sk.dobos.autobazar.models.Brand;

import java.util.HashSet;
import java.util.Set;

public class CarDTO {

    private Long id;
    private String type;
    Set<Brand> brandsOfTheCar = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<Brand> getBrandsOfTheCar() {
        return brandsOfTheCar;
    }

    public void setBrandsOfTheCar(Set<Brand> brandsOfTheCar) {
        this.brandsOfTheCar = brandsOfTheCar;
    }
}
