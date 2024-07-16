package az.edu.itbrains.lesson14.error_success;

import az.edu.itbrains.lesson14.error_success.result.DataResult;
import az.edu.itbrains.lesson14.error_success.result.Result;
import az.edu.itbrains.lesson14.error_success.result.error.ErrorResult;

public class Main {
    public static void main(String[] args) {
        Result errorResult=new ErrorResult("Xeta");
        System.out.println(errorResult.getMessage());

        CarService carService = new CarService();
        Result result = carService.addFuel();
        System.out.println(result.getMessage());

        DataResult<String> stringDataResult = new DataResult<>(true, "Salam", "String");
        System.out.println(stringDataResult.isSuccess());
        System.out.println(stringDataResult.getMessage());
        System.out.println(stringDataResult.getData());
    }
}
