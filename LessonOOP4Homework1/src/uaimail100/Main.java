package uaimail100;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

//		Student student1 = new Student("Masha", "Petrova", 19, 2);
//		Student student2 = new Student("Kolya", "Sidorov", 17, 1);
//		Student student3 = new Student("Vasya", "Nosov", 19, 1); //
//		Student student4 = new Student("Petya", "Ivanov", 16, 1);
//		Student student5 = new Student("Stepan", "Petrovich", 19, 1);
//		Student student6 = new Student("Vasya", "Petrovich", 19, 1);
//		Student student7 = new Student("Anton", "Aronov", 19, 1); //
//		Student student8 = new Student("Alena", "Retrova", 19, 2);
//		Student student9 = new Student("Alena", "Qwadrova", 19, 2);
//		Student student10 = new Student("Alena", "Vetrova", 20, 2);
//		// Student student11 = new Student("Svetlana", "Kustova", 19, 2);
//		// Student student12 = new Student("Svetlana", "Levakova", 17, 2);

		Group group = new Group();

		// Test add / delete
//		try {
//			group.addStudent(student1);
//			group.addStudent(student2);
//			group.addStudent(student3);
//			group.addStudent(student4);
//			group.addStudent(student5);
//			group.addStudent(student6);
//			group.addStudent(student7);
//			group.addStudent(student8);
//			group.addStudent(student9);
//			group.addStudent(student10);
//			// // group.addStudent(student11); // Kustova
//			group.deleteStudent(student3);
//			group.deleteStudent(student7);
//			// group.deleteStudent(student12); // Levakova
//			//
//		} catch (ExtraStudentInGroupException | StudentNotFountException e) {
//			System.out.println(e.getMessage());
//		}

		addGroupDialog(group); 
		
		group.printStudents(group.getStudents());

		// Test compareTo for Student by lastName (dont support null)
		System.out.println();
		
		try {
			System.out.println("COMPARE = " + group.getStudents()[1].compareTo(group.getStudents()[2]));
			System.out.println("COMPARE = " + group.getStudents()[5].compareTo(group.getStudents()[6]));
		} catch (NullPointerException e) {
			System.out.println("Sorry, not support compare with null");
		}

		// Voencom
		System.out.println();

		if (group.filterVoencom(18) != null) {
			System.out.println("Voencom:");
			group.printStudents(group.filterVoencom(18));
		} else {
			System.out.println("Voencom doesnt catch anyone");
		}

		
		// Compare with lambda - age
		System.out.println();
		System.out.println("Compare with lambda - age:");

		Arrays.sort(group.getStudents(),
				(c, b) -> CheckNull.checkNull(c, b) != CheckNull.NOT_NULL ? CheckNull.checkNull(c, b)
						: (c.getAge() - b.getAge()));

		group.printStudents(group.getStudents());

		
		// Compare with lambda - sex
		System.out.println();
		System.out.println("Compare with lambda - sex:");

		Arrays.sort(group.getStudents(),
				(c, b) -> CheckNull.checkNull(c, b) != CheckNull.NOT_NULL ? CheckNull.checkNull(c, b)
						: (c.getSex() - b.getSex()));

		group.printStudents(group.getStudents());

	}

	static public void addGroupDialog(Group group) {
		for (;;) {

			try {
				group.addStudent(group.getStudentDialog());

				String answer = group
						.getStringDialog("\"Y\", if you want по repeat input Students. Other symbol - exit");
				if (!answer.equals("Y")) {
					return;
				}
			} catch (ExtraStudentInGroupException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
				break;
			} catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		return;
	}

}
