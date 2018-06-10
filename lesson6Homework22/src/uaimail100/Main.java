package uaimail100;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Ќайдите самый большой палиндром, полученный умножением двух трехзначных чисел
		
		//System.out.println(m(10, 99));
		System.out.println(m(100, 999));

	}

	public static boolean checkPolindrom(int digit) {

		String str = Integer.toString(digit);

		boolean result = false;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
				result = true;
			} else {
				result = false;
				break;
			}
		}

		return result;
	}

	public static int m(int from, int to) {
		int b = 0;
		int max = 0;

		for (int i = from; i <= to; i++) {
			for (int j = from; j <= to; j++) {
				b = i * j;

				if (checkPolindrom(b)) {
					if (b > max) {
						max = b;
					}
				}

			}
		}
		return max;
	}

}
