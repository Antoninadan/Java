package iuamail100;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Input Bx: ");
		double bX = sc.nextDouble();
		System.out.println("Input By: ");
		double bY = sc.nextDouble();

		System.out.println("Input Cx: ");
		double cX = sc.nextDouble();
		System.out.println("Input Cy: ");
		double cY = sc.nextDouble();

		System.out.println("Input Xx: ");
		double xX = sc.nextDouble();
		System.out.println("Input Xy: ");
		double xY = sc.nextDouble();

		double distanceAX = Math.sqrt(xX * xX + xY * xY);
		double distanceBX = Math.sqrt((xX - bX) * (xX - bX) + (xY - bY) * (xY - bY));
		double distanceCX = Math.sqrt((xX - cX) * (xX - cX) + (xY - cY) * (xY - cY));
		double distanceAB = Math.sqrt(bX * bX + bY * bY);
		double distanceAC = Math.sqrt(cX * cX + cY * cY);
		double distanceBC = Math.sqrt((bX - cX) * (bX - cX) + (bY - cY) * (bY - cY));

		if ((distanceAX + distanceBX + distanceCX) <= (distanceAB + distanceAC + distanceBC)) {
			System.out.println("Point is in the triangle");
		} else {
			System.out.println("Point is not in the triangle");
		}

	}

}


/*//Написать программу, которая считает 4 числа c клавиатуры и выведет на экран самое большое из них.

Scanner sc = new Scanner(System.in);

System.out.println("Input digit1: ");
int digit1 = sc.nextInt();

System.out.println("Input digit2: ");
int digit2 = sc.nextInt();

System.out.println("Input digit3: ");
int digit3 = sc.nextInt();

System.out.println("Input digit4: ");
int digit4 = sc.nextInt();

int digitMax;

digitMax = digit1;

if (digit2 >= digitMax) {
	digitMax = digit2;
}
if (digit3 >= digitMax) {
	digitMax = digit3;
}
if (digit4 >= digitMax) {
	digitMax = digit4;
}

System.out.println("Max = " + digitMax);
*/

/*// 9-ти этажный дом 
Scanner sc = new Scanner(System.in);

		System.out.println("Input flat number: ");
		int flatNumber = sc.nextInt();
		int entrance;
		int floor;

		if (flatNumber >= 1 && flatNumber <= 144) {

			entrance = ((flatNumber - 1) / 36 + 1);
			floor = Math.abs(((flatNumber - 1) / 4 + 1) - (entrance - 1) * 9);

			System.out.println("Entrance = " + entrance);
			System.out.println("Floor = " + floor);

		} else {
			System.out.println("Wrong flat number");
		}
*/

/*// Leap year
  Scanner sc = new Scanner(System.in);

		System.out.println("Input year: ");
		int year = sc.nextInt();

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {

			System.out.println("Leap year with 366 days");

		} else {
			System.out.println("Non leap year wiyh 365 days");
		}
 */


/*// Triangle
		Scanner sc = new Scanner(System.in);

		System.out.println("Input side a: ");
		double sideA = sc.nextDouble();
		
		System.out.println("Input side b: ");
		double sideB = sc.nextDouble();
		
		System.out.println("Input side c: ");
		double sideC = sc.nextDouble();
		

		if (((sideA + sideB) > sideC) && ((sideB + sideC) > sideA) && ((sideC + sideA) > sideB)) {

			System.out.println("Triangle exists");

		} else {
			System.out.println("Triangle does not exist");
		}  
*/

/*
//Вхождение в круг
		Scanner sc = new Scanner(System.in);

		System.out.println("Input x: ");
		double x = sc.nextDouble();

		System.out.println("Input y: ");
		double y = sc.nextDouble();

		if ((Math.sqrt(x * x + y * y)) <= 4) {
			System.out.println("Point is in the circle");
		} else {
			System.out.println("Point is not in the circle");
		}
*/

