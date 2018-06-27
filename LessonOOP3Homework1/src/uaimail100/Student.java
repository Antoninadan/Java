package uaimail100;

public class Student extends Human {

	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String firstName, String lastName, int age, int sex) {
		super(firstName, lastName, age, sex);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "[" + lastName + ", " + firstName  + "]";
	}
	
}
