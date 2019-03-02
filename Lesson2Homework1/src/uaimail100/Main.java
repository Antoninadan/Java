/*
 Написать программу, которая считывает 5-и значное число с клавиатуры и выводит цифры, из которого оно состоит.
Например: Считывается число 54698
Выводиться:
5
4
6
9
8 
 */

package uaimail100;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number;
		int part1;
		int part2;
		int part3;
		int part4;
		int part5;

		Scanner sc = new Scanner(System.in);

		System.out.println("Input a five-digit number: ");
		number = sc.nextInt();

		part1 = number / 10000;
		part2 = number % 10000 / 1000;
		part3 = number % 1000 / 100;
		part4 = number % 100 / 10;
		part5 = number % 10;

		System.out.println(part1);
		System.out.println(part2);
		System.out.println(part3);
		System.out.println(part4);
		System.out.println(part5);

	}

}
