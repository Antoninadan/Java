package uaimail100;

import javax.swing.JOptionPane;

public class Student extends Human implements Comparable, Voencom {
	
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
		return super.toString();
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

	@Override
	public boolean filter(int rate) {
		
		if ((this.getAge() >= rate) && (this.getSex() == 1)) {
			return true;
		}
		return false;
	}
	
	
}
