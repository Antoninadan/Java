package uaimail100;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * double price = 5; if (true) { System.out.println("true"); }
		 * 
		 * if (false) { System.out.println("1"); } else { System.out.println("false"); }
		 * 
		 * int b; int a = 1; b = (a > 1) ? 1 : 0; System.out.println(b);
		 */

		/*
		 * find max Scanner sc = new Scanner(System.in);
		 * 
		 * int priceA; System.out.println("Input A: "); priceA = sc.nextInt();
		 * 
		 * int priceB; System.out.println("Input B: "); priceB = sc.nextInt();
		 * 
		 * int priceC; System.out.println("Input C: "); priceC = sc.nextInt();
		 * 
		 * int priceMax; priceMax = priceA;
		 * 
		 * if (priceB >= priceMax) { priceMax = priceB; }
		 * 
		 * if (priceC >= priceMax) { priceMax = priceC; }
		 * 
		 * System.out.println("Max = " + priceMax);
		 */
		/*
		 * if (true ^ (false ^ false ) ) { System.out.println("true"); }
		 */

		Scanner sc = new Scanner(System.in);
		int digital = sc.nextInt();

		switch (digital % 7) {
		case 1:
			System.out.println("monda");
			break;
		case 2:
			System.out.println("thu");
			break;
		case 3:
			System.out.println("we");
			break;
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("friday");
			break;	
		case 6:
			System.out.println("6");
			break;	
		case 0:
			System.out.println("sunday");
			break;	
		}

	}
}

