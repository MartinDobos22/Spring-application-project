package sk.dobos.autobazar.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import sk.dobos.autobazar.models.Car;
import sk.dobos.autobazar.models.dto.CarDTO;

@Mapper
public interface CarMapper {
    //implementation carmapperimpl for DTO
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mapping(target = "brandsOfTheCar", source = "brands")
    CarDTO carToCarDto(Car car);
    @Mapping(target = "brands", source = "brandsOfTheCar")
    Car carDtoToCar(CarDTO carDTO);

}
