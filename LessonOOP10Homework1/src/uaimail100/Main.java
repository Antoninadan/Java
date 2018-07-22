package uaimail100;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// all files
		File fileEnglish = new File("English.txt");
		File fileDictionary = new File("dictionary.txt");
		File fileUkraine = new File("Ukraine.txt");

		// get what we want to translate
		String textEnglish = loadStrFromFile(fileEnglish);

		// translate and save to file
		String textUkraine = translateEnglishUkraine(textEnglish, fileDictionary);
		saveStrToFile(fileUkraine, textUkraine);
	}

	// load String from file
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

	// save String to file
	public static void saveStrToFile(File file, String text) {

		try (PrintWriter pw = new PrintWriter(file)) {
			pw.println(text);
		} catch (IOException e) {

		}
	}

	// translate
	public static String translateEnglishUkraine(String textEnglish, File fileDictionary) {
		String textUkraine = "";

		// unserialize dictionary
		Dictionary dictionary = new Dictionary(fileDictionary);

		try {
			dictionary = (Dictionary) SerService.loadObject(fileDictionary);
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// make Set of dictionary keys
		Set<String> keySet = dictionary.getMap().keySet();

		// devide textEnglish into words
		String[] strDif;

		strDif = textEnglish.split("[\n\r ]");

		for (int i = 0; i < strDif.length; i++) {

			if (strDif[i].equals("")) {
				textUkraine += System.lineSeparator();
			} else if (isWordInDictinary(strDif[i], keySet)) {
				textUkraine += dictionary.getMap().get(strDif[i]);
			}
			
			if (!strDif[i].equals("") && (i != strDif.length- 1) && (!strDif[i + 1].equals(""))) {
				textUkraine += " ";
			}
		}

		System.out.println(textUkraine);

		return textUkraine;
	}

	// check word in dictionary
	public static boolean isWordInDictinary(String word, Set<String> keySet) {

		for (String k : keySet) {
			if (k.equals(word)) {
				return true;
			}
		}
		return false;
	}

}
