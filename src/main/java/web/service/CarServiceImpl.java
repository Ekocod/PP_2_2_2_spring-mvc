package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private final List<Car> carList;

    public CarServiceImpl() {
        carList = new ArrayList<>();
        carList.add(new Car(1, "Ford", "Mustang"));
        carList.add(new Car(2, "Porsche", "Cayenne"));
        carList.add(new Car(3, "Range Rover", "SDV6"));
        carList.add(new Car(4, "Volkswagen", "Tuareg"));
        carList.add(new Car(5, "BMW", "X6"));
    }

    @Override
    public List<Car> getAllCars() {
        return carList;
    }

    @Override
    public List<Car> getCountCars(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}