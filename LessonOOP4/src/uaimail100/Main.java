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
		
		System.out.println(baby.playWith(catOne));
		
		Cat [] cats = new Cat[] {catOne, catTwo, catThree, catFour, catFive};
		
		for (Cat a:cats) {
			System.out.println(a);
		}
		
		System.out.println();
		
		Arrays.sort(cats); 
				
		for (Cat a:cats) {
			System.out.println(a);
		}

	}

}
