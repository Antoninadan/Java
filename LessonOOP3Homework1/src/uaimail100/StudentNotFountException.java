package uaimail100;

public class StudentNotFountException extends Exception{
	String who;
	
	public StudentNotFountException() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public StudentNotFountException(String who) {
		super();
		this.who = who;
	}


	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Student is not in Group: " + who;
	}
	
}
