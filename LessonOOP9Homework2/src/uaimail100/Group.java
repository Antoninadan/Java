package uaimail100;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

public class Group implements Serializable {
	private int length = 10;
	private List<Student> students = new ArrayList<>();
	private static final long serialVersionUID = 1L;

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void addStudent(Student student) throws ExtraStudentInGroupException {

		if (students.size() != length) {
			students.add(student);
		} else {
			throw new ExtraStudentInGroupException(student.toString());
		}

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

	public void deleteStudent(int serialNumber) throws StudentNotFountException {

		Iterator<Student> itr = students.iterator();

		for (; itr.hasNext();) {
			Student element = itr.next();
			if (element.getSerialNumber() == serialNumber) {
				itr.remove();
				return;
			}
		}
		throw new StudentNotFountException("" + serialNumber);
	}

	public Student searchStudentbyLastName(String mask) throws StudentNotFountException {

		for (Student s : students) {
			if (s.getLastName().equals(mask)) {
				return s;
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
				if ((result < 1) || (result > 2)) {
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

	
	@Override
	public String toString() {

		String str = "";
		for (Student s : students) {
			str += s.toString() + System.lineSeparator();
		}
		return str;
	}

}
