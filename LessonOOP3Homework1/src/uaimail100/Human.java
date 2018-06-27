package uaimail100;

public class Human {
	String firstName;
	String lastName;
	int age;
	int sex; // 1- Male, 2-Female
	
	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Human(String firstName, String lastName, int age, int sex) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.sex = sex;
	}


	public String getLastName() {
		return lastName;
	}


	@Override
	public String toString() {
		return "Human [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", sex=" + sex + "]";
	}

	
}
