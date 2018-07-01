package uaimail100;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Group {
	private int length = 10;

	private Student[] students = new Student[length];

	
	@Override
	public String toString() {
		return "Group [length=" + length + ", students=" + Arrays.toString(students) + "]";
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

		Student student = new Student(firstName, lastName, age, sex);

		return student;
	}

	// Not good realization
	public void deleteStudent(Student student) throws StudentNotFountException {

		for (int i = 0; i < length; i++) {
			if ((students[i] != null) && (students[i].equals(student))) {
				students[i] = null;
				return;
			}
		}
		throw new StudentNotFountException(student.toString());
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
	
	public Student[] filterVoencom(int rate) {

		int n = 0;
		for (Student s : this.getStudents()) {
			if ((s != null) && (s.filter(rate))) {
				n++;
			}
		}

		if (n == 0) {
			return null;
		}

		Student[] mas = new Student[n];
		int k = 0;
		for (int i = 0; i < this.length; i++) {
			if  ((this.getStudents()[i] != null) && (this.getStudents()[i].filter(rate))) {
				mas[k] = this.getStudents()[i];
				k++;
			}
		}
		return mas;
	}
	

	
	public void printStudents(Student[] mas) {

		for (Student s : mas) {
			if (s == null) {
				System.out.println("null");
			} else {
				System.out.println(s.toString());
			}
		}
	}
	
}
