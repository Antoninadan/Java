package uaimail100;

public class WrongSexException extends Exception {

	public WrongSexException() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Must be 1-male or 2-female";
	}

	
}
