package uaimail100;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("Masha", "Etrova", 19, 2, 1);
		Student student2 = new Student("Kolya", "Idorov", 17, 1, 2);
		Student student3 = new Student("Vasya", "Osov", 19, 1, 3); 
		Student student4 = new Student("Petya", "Ivanov", 16, 1, 4);
		Student student5 = new Student("Stepan", "Etrovich", 19, 1, 5);
		Student student6 = new Student("Vasya", "Petrovich", 19, 1, 6);
		Student student7 = new Student("Anton", "Ronov", 19, 1, 7); 
		Student student8 = new Student("Alena", "Retrova", 19, 2, 8);
		Student student9 = new Student("Alena", "Qwadrova", 19, 2, 9);
		
	
		Group group1 = new Group();
		Group group2 = new Group();

		// add / delete
		try {
			group1.addStudent(student1);
			group1.addStudent(student2);
			group1.addStudent(student3);
			group1.addStudent(student4);
			group1.addStudent(student5);
			group1.deleteStudent(4);			
			group2.addStudent(student6);
			group2.addStudent(student7);
			group2.addStudent(student8);
			group2.addStudent(student9);
		} catch (ExtraStudentInGroupException | StudentNotFountException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Group 1:");
		System.out.println(group1);				
		System.out.println();
		
		System.out.println("Group 2:");
		System.out.println(group2);
		System.out.println();				
		
		File file=new File("group1.txt");
		
		Group[] g = new Group[] {group1, group2};
		
		try {
			SerService.saveObjectArray(file, g);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		g  = null;
		try {
			g = (Group[]) SerService.loadGroupArray(file, 2);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Groups after reading: _____________________");
		System.out.println();
		for (Group gr : g) {
			System.out.println(gr);
			System.out.println();
		}
		
	}

}
