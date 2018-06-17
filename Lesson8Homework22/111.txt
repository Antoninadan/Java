package uaimail100;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//File file = new File("text.txt");
		File file = new File("FAHRENHEIT_451.txt");
		String str = loadStrFromFile(file);

		int[] mas = new int[130];
		int ascii;

		for (int i = 0; i < str.length(); i++) {
			ascii = (int) str.charAt(i);
			mas[ascii]++;
		}

		int size = 0;
		for (int i = 0; i < mas.length; i++) {
			if ((mas[i] != 0) && (((65 <= i) && (i <= 90)) || ((97 <= i) && (i <= 122)))) {
				size++;
			}
		}

		String strResult = "";
		String[] masResult = new String[size];
		String iFormat;
		int n = 0;

		for (int i = 0; i < mas.length; i++) {
			if ((mas[i] != 0) && (((65 <= i) && (i <= 90)) || ((97 <= i) && (i <= 122)))) {
				iFormat = String.format("%09d", mas[i]);
				strResult = iFormat + " = ascii number " + i + " is " + "\"" + (char) i + "\"";
				masResult[n] = strResult;
				n++;
			}

		}
		
		// sort
		Arrays.sort(masResult, Collections.reverseOrder());

		// Print
		for (String element : masResult) {
			System.out.println(element);
		}
	}

	public static String loadStrFromFile(File file) {
		String text = "";
		try (Scanner sc = new Scanner(file)) {
			for (; sc.hasNextLine();) {
				text += sc.nextLine() + System.lineSeparator();
			}
		} catch (IOException e) {

		}
		return text;
	}
}
