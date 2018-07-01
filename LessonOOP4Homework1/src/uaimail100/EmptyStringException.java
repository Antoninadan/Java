package uaimail100;

public class EmptyStringException extends Exception {

	public EmptyStringException() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Must be filled";
	}

	
}
