package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    private final List<Car> cars;
    private final int DEFAULT_COUNT = 5;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Prado", "A123AA"));
        cars.add(new Car("Toyota", "Prius", "B234BB"));
        cars.add(new Car("Volkswagen", "Polo", "C123CC"));
        cars.add(new Car("Skoda", "Octavia", "D123DD"));
        cars.add(new Car("Hyundai", "Solaris", "E123EE"));
    }

    public List<Car> getCars (Integer count) {
        if (count == null || count < 0)
            return cars.subList(0, DEFAULT_COUNT);
        else
            return count <= 4 ? cars.subList(0, count) : cars;
    }
}
