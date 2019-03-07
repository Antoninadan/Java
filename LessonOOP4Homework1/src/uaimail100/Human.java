package uaimail100;

import java.io.Serializable;

public class Human implements Serializable {
	private String firstName;
	private String lastName;
	private int age;
	private int sex; // 1- male, 2- female
	private static final long serialVersionUID = 1L;
	
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

	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public int getAge() {
		return age;
	}


	public int getSex() {
		return sex;
	}


	@Override
	public String toString() {
		return lastName + ", " + firstName  + ", " + age + ", " + sex;
	}

	
	
}
