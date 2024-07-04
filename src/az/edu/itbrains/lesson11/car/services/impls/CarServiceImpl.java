package az.edu.itbrains.lesson11.car.services.impls;

import az.edu.itbrains.lesson11.car.models.Car;
import az.edu.itbrains.lesson11.car.services.CarService;

public class CarServiceImpl implements CarService {


    @Override
    public void run(Car car, double km) {
        double currentMillage = car.getMillage();
        // 100 km - 7l
        // 200 km - x
        double fuelResult = km * car.getFuelPerMillage() / 100;
        double lastFuel = car.getFuel() - fuelResult;
        if (lastFuel >= 0) {
            double newMillage = currentMillage + km;
            car.setMillage(newMillage);
            car.setFuel(lastFuel);
        } else {
            System.out.println("Kifayət qədər yanacağınız yoxdur");
        }
    }

    @Override
    public Car getInfo(Car car) {
        return car;
    }

    @Override
    public void fuelStation(Car car, int fuel) {
        double sumFuel = car.getFuel() + fuel;
        if (sumFuel > car.getMaxFuel()) {
            System.out.println("Bu qədər benzin doldura bilmərsiniz");
        } else {
            car.setFuel(sumFuel);
        }
    }


}
