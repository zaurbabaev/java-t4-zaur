package az.edu.itbrains.lesson14.error_success;

import az.edu.itbrains.lesson14.error_success.result.Result;
import az.edu.itbrains.lesson14.error_success.result.error.ErrorResult;
import az.edu.itbrains.lesson14.error_success.result.success.SuccessResult;

public class CarService {

    public Result addFuel() {
        try {
            return new SuccessResult("Benzin elave olundu");
        } catch (Exception e) {
            return new ErrorResult(e.getMessage());
        }
    }
}
