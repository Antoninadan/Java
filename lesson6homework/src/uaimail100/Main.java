package uaimail100;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		// Max digit
		int mas[] = { 1, 4, 2, 6, 7, 5, 67, 2 };
		System.out.println("Homework 11: Max = " + max(mas));

		// Concatenation
		concat(3, 5.789, "Homework 12: summ=");
		
		// Draw rectangle
		System.out.println("Homework 13:");
		drawRectangle(5, 8);
		
		// Find element in massive
		int mas2[] = { 1, 4, 2, 6, 7, 5, 67, 2 };
		System.out.println("Homework 14: Index = " + findElement(mas2, 19));
		
		// 
		String str = "kjk 777     ";	
		System.out.println("Homework 15: Count words = " + countWords(str));
	}

	public static int max(int[] mas) {
		int max;
		max = mas[0];
		for (int i : mas) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}

	public static void concat(int i, double d, String s) {
		System.out.println(s + (i + d));
	}
	
	public static void drawRectangle(int height, int width) {
		for (int i=1; i<=height; i++) {
			for (int j=1; j<=width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static int findElement(int[] mas, int element) {
		int index = -1;
		
		for (int i=0; i<mas.length; i++) {
			if (mas[i] == element) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public static int countWords(String str) {
		int c=0;
		 
		for (String s:str.split("[ ]")) {
			if (s.length() > 0) {
				c++;
			}
		}
		
		return c;	
	}
	

}
