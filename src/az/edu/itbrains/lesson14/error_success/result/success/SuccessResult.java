package az.edu.itbrains.lesson14.error_success.result.success;

import az.edu.itbrains.lesson14.error_success.result.Result;

public class SuccessResult extends Result {

    public SuccessResult(String message) {
        super(true, message);
    }

    public SuccessResult() {
        super(true);
    }
}
