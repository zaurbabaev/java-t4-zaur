package az.edu.itbrains.lesson11.car.services;

import az.edu.itbrains.lesson11.car.models.Car;

public interface CarService {

    void run(Car car, double km);

    Car getInfo(Car car);

    void fuelStation(Car car, int fuel);

}
