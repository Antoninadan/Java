package uaimail100;

import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("Masha", "Petrova", 19, 2, 1);
		Student student2 = new Student("Kolya", "Sidorov", 17, 1, 2);
		Student student3 = new Student("Vasya", "Osov", 19, 1, 3); 
		Student student4 = new Student("Petya", "Ivanov", 16, 1, 4);
		Student student5 = new Student("Stepan", "Antoniv", 19, 1, 5);
		Student student6 = new Student("Vasya", "Petrovich", 19, 1, 6);
		Student student7 = new Student("Anton", "Ronov", 19, 1, 7); 
		Student student8 = new Student("Alena", "Retrova", 19, 2, 8);
		Student student9 = new Student("Alena", "Qwadrova", 19, 2, 9);
		
	
		Group group1 = new Group();

		// add 
		try {
			group1.addStudent(student1);
			group1.addStudent(student2);
			group1.addStudent(student3);
			group1.addStudent(student4);
			group1.addStudent(student5);	
			group1.addStudent(student6);
		} catch (ExtraStudentInGroupException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Group 1:");
		System.out.println(group1);				
		
		// delete
		try {
			group1.deleteStudent(4);			
		} catch (StudentNotFountException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Group 1 after delete:");
		System.out.println(group1);				
		System.out.println();
		

		try {
		System.out.println("Result of search: " + group1.searchStudentbyLastName("Sidorov"));
		System.out.println("Result of search: " + group1.searchStudentbyLastName("Idorovdsf"));
		} catch (StudentNotFountException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
	
		System.out.println("Group 1 after sort:");
		Collections.sort(group1.getStudents());
		System.out.println(group1);
		
	}

}
