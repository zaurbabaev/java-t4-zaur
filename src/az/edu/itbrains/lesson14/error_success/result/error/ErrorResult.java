package az.edu.itbrains.lesson14.error_success.result.error;

import az.edu.itbrains.lesson14.error_success.result.Result;

public class ErrorResult extends Result {
    public ErrorResult(String message) {
        super(false, message);
    }

    public ErrorResult(){
        super(false);
    }
}
