package uaimail100;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * ¬вести с консоли число в бинарном формате. ѕеревести его вдес€тичный и
		 * вывести на экран (У10Ф -> 2).
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Input binary digit:");
		int integer = sc.nextInt(2);
			
		System.out.println("Your digit in decimal system = " + integer);
	}

}
