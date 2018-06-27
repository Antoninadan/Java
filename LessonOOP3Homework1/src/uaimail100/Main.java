package uaimail100;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
	
		Student student1 = new Student("Petya", "Ivanov", 21, 1);
		Student student2 = new Student("Vasya", "Nosov", 19, 1);
		Student student3 = new Student("Kolya", "Sidorov", 18, 1);
		Student student4 = new Student("Masha", "Petrova", 19, 2);
		Student student5 = new Student("Galya", "Petrovich", 19, 2);
		Student student6 = new Student("Vasya", "Petrovich", 19, 1);
		Student student7 = new Student("Anton", "Aronov", 19, 1);
		Student student8 = new Student("Alena", "Retrova", 19, 2);
		Student student9 = new Student("Alena", "Qwadrova", 19, 2);
		Student student10 = new Student("Alena", "Vetrova", 20, 2);
		Student student11 = new Student("Svetlana", "Kustova", 19, 2);
		Student student12 = new Student("Svetlana", "Levakova", 17, 2);
		
		Group group = new Group();
		
		// Test add / delete
		try {
			group.addStudent(student1);
			group.addStudent(student2);
			group.addStudent(student3);
			group.addStudent(student4);
			group.addStudent(student5);
			group.addStudent(student6);
			group.addStudent(student7);
			group.addStudent(student8);
			group.addStudent(student9);
			group.addStudent(student10);
		//	group.addStudent(student11); // Kustova
			group.deleteStudent(student3);
			group.deleteStudent(student4);
			group.deleteStudent(student12);
					
		} catch (ExtraStudentInGroupException | StudentNotFountException e) 
		{
			System.out.println(e.getMessage());
		}
	
		System.out.println("Group = " + group.toString());
		
		// Test search
		try {
			
			System.out.println("Result of search \"Ivanov\" = " + group.searchStudentbyLastName("Ivanov").toString());
			System.out.println("Result of search \"Rtt\" = " + group.searchStudentbyLastName("Rtt").toString());
			
		} catch (StudentNotFountException e) 
		{
			System.out.println(e.getMessage());
		}
	
		
//		String[] str = new String[] {"fd", "345", "qw"};
//		
//		
//		System.out.println(Arrays.toString(str));
//		//bubbleSort(str);
//		System.out.println(Arrays.toString(bubbleSort(str)));
//		
//		
//		System.out.println(Arrays.toString(bubbleSortStudent(group.getStudents())));
//		
		
		
	}
	
//	public static String[] bubbleSort(String[] mas){
//   
//    for(int i = mas.length-1 ; i > 0 ; i--){
//        for(int j = 0 ; j < i ; j++){
//
//            if( mas[j].compareTo(mas[j+1]) > 0){
//                String tmp = mas[j];
//                mas[j] = mas[j+1];
//                mas[j+1] = tmp;
//            }
//        }
//    }
//    return mas;
//}
//	
//	public static Student[] bubbleSortStudent(Student[] mas){
//		   
//	    for(int i = mas.length-1 ; i > 0 ; i--){
//	        for(int j = 0 ; j < i ; j++){
//
//	            if((mas[j+1] != null) && (mas[j] != null) && ( mas[j].getLastName().compareTo(mas[j+1].getLastName()) > 0)){
//	            	Student tmp = mas[j];
//	                mas[j] = mas[j+1];
//	                mas[j+1] = tmp;
//	            }
//	        }
//	    }
//	    return mas;
//	}
	
}
