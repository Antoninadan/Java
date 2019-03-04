// interface

package uaimail100;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Baby baby = new Baby("Maugli", 3);
		
		Cat catOne = new Cat("Vasya", 2);
		Cat catTwo = new Cat("Petya", 3);
		Cat catThree = new Cat("Jenya", 10);
		Cat catFour = new Cat("Yura", 6);
		Cat catFive = new Cat("Sergey", 1);

		Dog dogOne = new Dog();
		
		System.out.println(baby.playWith(catOne));
		System.out.println(baby.playWith(dogOne));
		
		Cat [] cats = new Cat[] {catOne, catTwo, catThree, catFour, catFive};
		
		for (Cat a:cats) {
			System.out.println(a);
		}
		
		System.out.println();
		
		Arrays.sort(cats); 
				
		for (Cat a:cats) {
			System.out.println(a);
		}

		System.out.println();

		// clonable-------------------------------------------------------------------------------------------
		ClonableClass cc1 = new ClonableClass(1, "Mumu");

		try {
			ClonableClass cc2 = cc1.clone();
			System.out.println("cc1 = " + cc1);
			System.out.println("cc2 = " + cc2);
			System.out.println("cc1 == cc2 = " + (cc1 == cc2));
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
