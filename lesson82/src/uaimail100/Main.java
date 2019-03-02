// save string to file

package uaimail100;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        // print write, can create file

//        String str = "Hello World";
//        File f = new File("hello2.txt");
//        saveStrToFile(f, str);


		String[] names = new String[] { "Luk", "Xan", "R2D2", "C3PIO", "Chubaka" };
		String[] lastNames = new String[] { "Skywoker", "Waider", "Solo", "Robot", "Chubaka!" };
		int[] money = new int[] { 500, -200, 10, 0, 10000 };

		String str = getInfo(names, lastNames, money);
		File f = new File("rrr.csv");

		saveStrToFile(f, str);



    }

    public static void saveStrToFile(File file, String text) {

        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println(text);
        } catch (IOException e) {

        }
    }

    public static String getInfo(String[] names, String[] lastNames, int[] money) {
        String result = "";

        for (int i = 0; i < names.length; i++) {
            result += names[i] + "," + lastNames[i] + "," + money[i] + System.lineSeparator();
        }
        return result;
    }

}
