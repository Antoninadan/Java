package uaimail100;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Напишите метод для считывания двухмерного массива из файла (размер массива
		// заранее неизвестен, определите его сами на основе данных в файле).

		File file = new File("test.txt"); // allow to have different length for each row

		int[][] mas = loadStrFromFileMassive(file);

		// Print
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j]);
				if (j != (mas[i].length - 1)) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}

	}

	public static int numberStrFile(File file) {
		int n = 0;
		try (Scanner sc = new Scanner(file)) {
			while (sc.hasNextLine()) {
				sc.nextLine();
				n++;
			}
		} catch (IOException e) {

		}
		return n;
	}

	public static int[][] loadStrFromFileMassive(File file) {
		String text = "";
		int size = numberStrFile(file);
		int[][] mas = new int[size][];
		String[] strMas;

		try (Scanner sc = new Scanner(file)) {
			for (int i = 0; i < size; i++) {
				text = sc.nextLine();
				strMas = text.split("[,]");

				mas[i] = new int[strMas.length];

				for (int j = 0; j < strMas.length; j++) {
					mas[i][j] = Integer.parseInt(strMas[j].trim());
				}
			}
		} catch (IOException e) {

		}

		return mas;
	}

}
