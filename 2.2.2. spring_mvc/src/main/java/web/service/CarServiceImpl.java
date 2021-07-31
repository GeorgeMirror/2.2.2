package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService{

    private List<Car> listCar;

    public CarServiceImpl() {
        listCar = new ArrayList<>();
        listCar.add(new Car("subaru", 123, (byte) 2));
        listCar.add(new Car("toyota", 456, (byte) 5));
        listCar.add(new Car("mersedes", 34, (byte) 3));
        listCar.add(new Car("lada", 5674, (byte) 10));
        listCar.add(new Car("bmw", 45, (byte) 56));
    }

    @Override
    public List<Car> getListCar(int count) {
        return listCar.stream().limit(count).collect(Collectors.toList());
    }
}
