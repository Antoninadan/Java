package uaimail100;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// read from file  
		
		File file = new File("rrr.csv");
		// System.out.println(loadStrFromFile(f));

		// File file = new File("src/uaimail100/Main.java");
//		String str = loadStrFromFile(file);
//		System.out.println(str);
//
//		String str2 = loadStrFromFileBuff(file);
//		System.out.println(str2);
		
		String str3 = loadFromUrl("https://prog.kiev.ua/forum/index.php/topic,3626.75.html");
			System.out.println(str3);
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

	public static String loadStrFromFileBuff(File file) {
		String result = "";
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String temp = "";
			for (; (temp = br.readLine()) != null;) {
				result += temp + System.lineSeparator();
			}
		} catch (IOException e) {

		}
		return result;
	}

	public static String loadFromUrl(String urlAddress) {
		String result = "";

		try {
			URL url = new URL(urlAddress);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			try (Scanner sc = new Scanner(connection.getInputStream())) {
				for (; sc.hasNextLine();) {
					result += sc.nextLine() + System.lineSeparator();
				}
			} catch (IOException e) {
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

}
