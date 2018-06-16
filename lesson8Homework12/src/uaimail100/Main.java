package uaimail100;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {

		// Напишите метод для сохранения в текстовый файл двухмерного массива целых
		// чисел

		int[][] mas = new int[][] { { 1, 2, 3 }, { 11, 22 }, { 111, 222, 333 }, { 1111, 2222, 3333, 4444, 5555 } };

		File file = new File("massive.txt");

		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String str = "";
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				str += mas[i][j];
				if ((mas[i].length - 1) != j) {
					str += ",";
				}
			}
			str += System.lineSeparator();
		}
		saveStrToFile(file, str);
	}

	public static void saveStrToFile(File file, String text) {

		try (PrintWriter pw = new PrintWriter(file)) {
			pw.println(text);
		} catch (IOException e) {
		}
	}

}
