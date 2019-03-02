/*
 Написать программу, которая вычислит и выведет на экран площадь треугольника, если известны его стороны. 
 */

package uaimail100;

public class Main {

	public static void main(String[] args) {

		double square = 0;
		double halfPerimeter = 0;
		double sideA = 7;
		double sideB = 4;
		double sideC = 5;

		halfPerimeter = (sideA + sideB + sideC) / 2;
		square = Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
		System.out.println("Square = " + square);

	}

}