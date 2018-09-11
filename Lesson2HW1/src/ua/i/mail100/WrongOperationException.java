package ua.i.mail100;

public class WrongOperationException extends Exception{

    @Override
    public String getMessage() {
        return "Wrong operation";
    }
}
