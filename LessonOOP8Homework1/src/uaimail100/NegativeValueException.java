package uaimail100;

public class NegativeValueException extends Exception {

	public NegativeValueException() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Must be positive";
	}

	
}
