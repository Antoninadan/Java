package uaimail100;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Реализуйте, программу которая выведет следующий член
		
/*		// TEST 
 		int[] mas1 = new int[] { 1, 10, 100, 1000 }; // next = 10000 (10 pow)
		int[] mas2 = new int[] { 1, 2, 3, 4, 5 }; // next = 6 (++1)
		int[] mas3 = new int[] { 1, 7, 9, 11 }; // bad!
		int[] mas4 = new int[] { 1, 4, 16, 64 }; // next 256 (pow of 2)
		int[] mas5 = new int[] { 1, 5, 25, 125 }; // next 625 (pow of 5)
		int[] mas6 = new int[] { 1, 4, 9, 16 }; // next = 25 (x pow 2, where x=1,2,..)  
		int[] mas7 = new int[] { 1, 8, 27, 64 }; // next = 125 (x pow 3, where x=1,2,..)
		int[] mas8 = new int[] { 1, 32, 243, 1024 }; // next = 3125 (x* pow 5, where x=1,2,..)
		int[] mas9 = new int[] { 0, 2, 4, 6, 8, 10, 12 }; // next = 14 (++2)
		int[] mas10 = new int[] { -1, 1, 3, 5 }; // next = 7 (++2)

		calc(mas1);
		calc(mas2);
		calc(mas3);
		calc(mas4);
		calc(mas5);
		calc(mas6);
		calc(mas7);
		calc(mas8);
		calc(mas9);
		calc(mas10);
*/

		calc(remakeStr2IntMas());
	}

	public static int[] remakeStr2IntMas() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input string (1, .. , ... , ...): ");
		String str = sc.nextLine();

		String[] mas = str.split("[,]");

		int[] mas2 = new int[mas.length];

		for (int i = 0; i < mas.length; i++) {
			mas2[i] = Integer.parseInt(mas[i].trim());
		}
		return mas2;

	}

	public static void calc(int[] mas) {

		int next;
		int method1 = 1; // counter for method
		int method2 = 1;
		int method3 = 1;

		int increment = mas[1] - mas[0]; // for first method
		int power; // for second method
		
		if (mas[0] != 0) {
			power = mas[1] / mas[0];
		} else {
			power = 1;
		}
		
		int power3 = 0; // for third method
		int remainder = mas[1];

		while ((remainder != 1) && (remainder % 2 == 0)) {
			remainder = remainder / 2;
			power3++;
		}

		for (int i = 2; i < mas.length; i++) {

			if (increment == (mas[i] - mas[i - 1])) {
				method1++;
			} else {
				method1 = 0;
			}

			if (power == (mas[i] / mas[i - 1])) {
				method2++;
			} else {
				method2 = 0;
			}

			if (mas[i] == (int) Math.pow(i + 1, power3)) {
				method3++;
			} else {
				method3 = 0;
			}

		}

		if (method1 == (mas.length - 1)) {
			next = mas[mas.length - 1] + increment;
		} else if (method2 == (mas.length - 1)) {
			next = (int) Math.pow(power, mas.length);
		} else if (method3 == (mas.length - 1)) {
			next = (int) Math.pow(mas.length + 1, power3);
		} else {
			next = -1;
		}

		if (next != -1) {
			System.out.println("next =  " + next);
		} else {
			System.out.println("Non parsed");
		}

	}

}
