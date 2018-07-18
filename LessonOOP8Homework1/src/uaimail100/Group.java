package uaimail100;

import java.io.Serializable;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Group implements Serializable {
	private int length = 5;
	private Student[] students = new Student[length];
	private static final long serialVersionUID = 1L;

	
	@Override
	public String toString() {
		String str = "";
		
		for (Student s : students) {
			if (s == null) {
				str += null + System.lineSeparator();
			} else {
				str += s.toString() + System.lineSeparator(); 
			}
		}
		
		return str;
	}



	public Student[] getStudents() {
		return students;
	}



	public void addStudent(Student student) throws ExtraStudentInGroupException {

		for (int i = 0; i < length; i++) {
			if (students[i] == null) {
				students[i] = student;
				return;
			}

		}
		throw new ExtraStudentInGroupException(student.toString());
	}

	public Student getStudentDialog() {
		String firstName = getStringDialog("first name");
		String lastName = getStringDialog("last name");
		int age = getIntDialog("age");
		int sex = getSexDialog("sex: 1-male; 2 - female");
		int serialNumber = getIntDialog("serial number");

		Student student = new Student(firstName, lastName, age, sex, serialNumber);

		return student;
	}

	// Not good realization
	public void deleteStudent(int serialNumber) throws StudentNotFountException {

		for (int i = 0; i < length; i++) {
			if ((students[i] != null) && (students[i].getSerialNumber() == serialNumber)) {
				students[i] = null;
				return;
			}
		}
		throw new StudentNotFountException("" + serialNumber);
	}

	public Student searchStudentbyLastName(String mask) throws StudentNotFountException {
		for (int i = 0; i < length; i++) {

			if ((students[i] != null) && (students[i].getLastName().equals(mask))) {
				return students[i];
			}

		}
		throw new StudentNotFountException(mask);
	}


	public int getIntDialog(String name) {
		int result;

		for (;;) {

			try {
				result = Integer.valueOf(JOptionPane.showInputDialog("Input " + name));
				if (result < 0) {
					throw new NegativeValueException();
				}
				return result;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error number format");
			} catch (NegativeValueException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}

		}
	}

	public int getSexDialog(String name) {
		int result;

		for (;;) {

			try {
				result = Integer.valueOf(JOptionPane.showInputDialog("Input " + name));
				if ((result < 1) || (result > 2))  {
					throw new WrongSexException();
				}				
				return result;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error number format");
			} catch (WrongSexException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}

		}
	}
	
	
	public String getStringDialog(String name) {
		String result;

		for (;;) {

			try {
				result = String.valueOf(JOptionPane.showInputDialog("Input " + name));

				if (result.equals("")) {
					throw new EmptyStringException();
				}
				return result;
			} catch (EmptyStringException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			} catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Set default = NULL");
				return result = "NULL";
			}

		}

	}
	
	
	public void printStudents() {

		for (Student s : students) {
			if (s == null) {
				System.out.println("null");
			} else {
				System.out.println(s.toString());
			}
		}
	}
	
}
