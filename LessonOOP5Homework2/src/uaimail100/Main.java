package uaimail100;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {

		File file1 = new File("file1.txt");
		File file2 = new File("file2.txt");
		File file3 = new File("file3.txt");

		String str1 = readFileToString(file1);
		String str2 = readFileToString(file2);

		saveToFile(getEqual(str1, str2), file3);  // apple plum cedar

	}

	public static String readFileToString(File file) {

		String str = "";
		String strAdd = "";

		try (BufferedReader f = new BufferedReader(new FileReader(file))) {
			for (; (str = f.readLine()) != null;) {
				strAdd += (str + System.lineSeparator());
			}
		} catch (IOException e) {
			System.out.println("ERROR");
		}

		return strAdd;
	}

	public static boolean isWordInString(String word, String str) {

		String[] strDif;
		strDif = str.split("[\n ]");

		for (String s : strDif) {
			if (s.replaceAll("\\s", "").equals(word)) {
				return true;
			}
		}
		return false;
	}

	public static String getEqual(String str1, String str2) {
		String[] str3;
		String[] strDif;
		String strAdd = "";

		strDif = str1.split("[\n ]");

		for (String s : strDif) {
			if (isWordInString(s.replaceAll("\\s", ""), str2)) {
				strAdd += s + " ";
			}
		}
		return strAdd;
	}

	public static File saveToFile(String str, File file) {

		if (file == null) {
			throw new IllegalArgumentException("Null file");
		}

		try (PrintWriter a = new PrintWriter(file)) {
			a.println(str);
		} catch (FileNotFoundException e) {
			System.out.println("ERROR FILE WRITE");
		}

		return file;
	}
}
