package uaimail100;

import java.util.Arrays;

public class Group {
	private int length = 10;

	private Student[] students = new Student[length];

	@Override
	public String toString() {
		Student[] mas;
		mas = bubbleSortStudent(students);
		return Arrays.toString(mas);
	}
	
	

	public Student[] getStudents() {
		return students;
	}


	public void addStudent(Student student) throws ExtraStudentInGroupException {
		int a = 0;
		for (int i = 0; i < length; i++) {
			if (students[i] == null) {
				students[i] = student;
				break;
			}
			a++;
		}

		if (a == (length))
			throw new ExtraStudentInGroupException(student.toString());
	}

	public void deleteStudent(Student student) throws StudentNotFountException {
		int a = 0;
		for (int i = 0; i < length; i++) {
			if ((students[i] != null) && (students[i].equals(student))) {
				students[i] = null;
				break;
			}
			a++;
		}

		if (a == (length))
			throw new StudentNotFountException(student.toString());
	}

	public Student searchStudentbyLastName(String mask) throws StudentNotFountException {
		int a = 0;
		for (int i = 0; i < length; i++) {
			
			if ((students[i] != null) && (students[i].getLastName().equals(mask))) {
				return students[i];
			}
			a++;
		}

		if (a == (length))
			throw new StudentNotFountException(mask);
		
		return null; 
	}
	
	public static Student[] bubbleSortStudent(Student[] mas){
		   
	    for(int i = mas.length-1 ; i > 0 ; i--){
	        for(int j = 0 ; j < i ; j++){

	            if((mas[j+1] != null) && (mas[j] != null) && ( mas[j].getLastName().compareTo(mas[j+1].getLastName()) > 0)){
	            	Student tmp = mas[j];
	                mas[j] = mas[j+1];
	                mas[j+1] = tmp;
	            }
	        }
	    }
	    return mas;
	}

}
