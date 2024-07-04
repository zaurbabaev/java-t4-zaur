package az.edu.itbrains.lesson11.car;

import az.edu.itbrains.lesson11.car.models.Car;
import az.edu.itbrains.lesson11.car.services.CarService;
import az.edu.itbrains.lesson11.car.services.impls.CarServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car();
        nissan.setId(1);
        nissan.setBrand("Nissan");
        nissan.setModel("Patrol");
        nissan.setMillage(0);
        nissan.setFuel(75);
        nissan.setMaxFuel(80);
        nissan.setFuelPerMillage(10);

        CarService carService = new CarServiceImpl();

        System.out.println("1. Hərəkətə başla");
        System.out.println("2. Məlumat lövhəsi");
        System.out.println("3. YDM");
        System.out.println("4. Çıxış");
        System.out.println("Rəqəm daxil edin");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int userInput = scanner.nextInt();
            if (userInput == 4) {
                break;
            }
            switch (userInput) {
                case 1 -> {
                    System.out.println("Hərəkətə başla");
                    int userKm = scanner.nextInt();
                    carService.run(nissan, userKm);
                }
                case 2 -> {
                    Car info = carService.getInfo(nissan);
                    System.out.println(info.getFuel());
                    System.out.println(info.getMillage());
                }
                case 3 -> carService.fuelStation(nissan, 30);

                default -> System.out.println("Düzgün rəqəm daxil edin");
            }
            ;
        }

    }
}
