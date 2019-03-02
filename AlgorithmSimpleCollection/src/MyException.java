public class MyException extends Exception {

    public MyException() {
        super();
    }

    @Override
    public String getMessage() {
        return "My exception text";
    }
}
