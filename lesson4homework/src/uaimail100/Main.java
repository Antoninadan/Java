package uaimail100;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		// Обои ////////////////////////////////////////////
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input number of rows: ");
//		int number = sc.nextInt();
//
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= number; j++) {
//				if (j % 2 == 0) {
//					System.out.print("***");
//				} else {
//					System.out.print("+++");
//				}
//				
//			}
//			System.out.println();
//		}
		
//		// Факториал /////////////////////////////////////////////
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input int number [4; 16]: ");
//		int number = sc.nextInt();
//		double factor = 1;
//
//		if (number >= 4 && number <= 16) {
//
//			for (int i = 1; i <= number; i++) {
//				factor = factor * i;
//			}
//
//			System.out.println("Factorial = " + factor);
//
//		} else {
//			System.out.print("Number not in [4; 16]");
//		}
		
//		// Таблица умножения на 5 ////////////////////////////////////
//
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i + " * 5 = " + (i * 5));
//		}
	
//		// Прямоугольник ///////////////////////////////////////////// 
//		
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Input height: ");
//		int height = sc.nextInt();
//		System.out.println("Input width: ");
//		int width = sc.nextInt();
//
//		for (int i = 1; i <= height; i++) {
//			for (int j = 1; j <= width; j++) {
//				if ((i == 1) || (i == height)) {
//					System.out.print("*");
//				} else {
//					if ((j == 1) || (j == width)) {
//						System.out.print("*");
//					} else {
//						System.out.print(" ");
//					}
//				}
//			}
//			System.out.println();
//		}
		
//		// Треугольник ////////////////////////////////////////
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input height: ");
//		int h = sc.nextInt();
//		double count; // общее число циклов
//		int sum = 0; // временная сумма для i
//		int transfer = 1; // инкремент для println
//
//		count = h * (h + 1) / 2 + h * (h - 1) / 2;
//
//		for (int i = 1; i <= count; i++) {
//
//			System.out.print("*");
//
//			if ((i == sum + transfer) && (i <= h * (h - 1) / 2)) {
//				System.out.println();
//				transfer++;
//				sum = i;
//			} else if ((i == sum + transfer) && (i > h * (h - 1) / 2)) {
//				System.out.println();
//				transfer--;
//				sum = i;
//			}
//		}

//		// Целые ///////////////////////////////////////////////
//		
//		int a = 0;
//
//		for (int i = 1; i <= 100; i++) {
//			for (int j = 2; j <= 9; j++) {
//				if ((i % j == 0) && (i > j)) {
//					a++;
//				}
//			}
//			if (a == 0) {
//				System.out.println(i);
//			}
//			a = 0;
//
//		}
		
//		// песочные часы ///////////////////////////////////////////////		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input odd number: ");
//		int number = sc.nextInt();
//		int a = 0;
//
//		if (number % 2 != 0) {
//
//			for (int i = 1; i <= number; i++) {
//				for (int j = 1; j <= number; j++) {
//					if ((j > a) && (j <= (number - a))) {
//						System.out.print("*");
//					} else {
//						System.out.print(" ");
//					}
//				}
//				
//				System.out.println();				
//				a = (i > number / 2) ? --a : ++a;
//			}
//		} else {
//			System.out.print("Number is even");
//		}
		
		
	}

}

