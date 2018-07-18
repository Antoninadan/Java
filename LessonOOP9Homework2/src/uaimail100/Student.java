package uaimail100;

import java.io.Serializable;

public class Student extends Human implements Comparable, Serializable {
	private int serialNumber;
	private static final long serialVersionUID = 1L;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String firstName, String lastName, int age, int sex, int serialNumber) {
		super(firstName, lastName, age, sex);
		this.serialNumber = serialNumber;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {

		return super.getLastName() + ", " + super.getFirstName() + ", " + super.getAge() + ", " + super.getSex() + ", "
				+ serialNumber;
	}

	@Override
	public int compareTo(Object arg0) {

		if (arg0 == null) {
			return 1;
		}
		Student other = (Student) arg0;

		String nameOther = other.getLastName();
		String nameThis = this.getLastName();

		if (nameThis.compareTo(nameOther) > 0) {
			return 1;
		}
		if (nameThis.compareTo(nameOther) < 0) {
			return -1;
		}

		return 0;
	}

}
