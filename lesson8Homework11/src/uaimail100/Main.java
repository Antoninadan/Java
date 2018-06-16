package uaimail100;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//Создайте консольный «текстовый редактор» с возможностью сохранения набранного текста в файл.

		File file = new File("your_file.txt");

		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Scanner sc = new Scanner(System.in);
		String str = "";
		String strResult = "";

		System.out.println("Input string, stop word \"end\" ");
		
		while (!str.equals("end")) {
			str = sc.nextLine();
			strResult += str + System.lineSeparator();
		}
		saveStrToFile(file, strResult);
	}

	public static void saveStrToFile(File file, String text) {

		try (PrintWriter pw = new PrintWriter(file)) {
			pw.println(text);
		} catch (IOException e) {
		}
	}

}
