import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        // factorial ----------------------------------------------------------------
//        System.out.println("factorial = " + factorial(5));

//        // hash code ----------------------------------------------------------------
//        hashCodeWhat();

//        // binary ----------------------------------------------------------------
//        int a = 277;
//        int b = 432;
//        int shift = 3;
//        System.out.println("binaryString " + a + " = " + binaryString(a));
//        System.out.println("binaryString " + b + " = " + binaryString(b));
//        System.out.println("binaryString " + shift + " = " + binaryString(shift));
//        System.out.println("a & b = " + (a & b));
//        System.out.println("a | b = " + (a | b));
//        System.out.println("a ^ b (XOR) = " + (a ^ b));
//        System.out.println("~a = " + (~a));
//        System.out.println();
//        System.out.println("a << shift = " + (a << shift) + " = " + Integer.toBinaryString(a << shift));
//        System.out.println("аналог << = a * 2*2*2 = " + (a * 2*2*2) + " = " + Integer.toBinaryString(a * 2*2*2));
//        System.out.println();
//        System.out.println("a >> shift = " + (a >> shift) + " = " + Integer.toBinaryString(a >> shift));
//        System.out.println("аналог >> = a/2/2/2 = " + (a/2/2/2) + " = " + Integer.toBinaryString(a/2/2/2));
//        System.out.println();

//        // save string to file ----------------------------------------------------------------
//        String str = "Hello World";
//        File f = new File("hello2.txt");
//        saveStrToFile(f, str);

//        // read string from file
//        File file = new File("hello2.txt");
//        System.out.println(loadStrFromFile(file));

//        // read string from url
//        String url = "https://prog.kiev.ua/forum/index.php/topic,3626.75.html";
//        System.out.println(loadFromUrl(url));

//        // exception
//        double a;
//        for (;;) {
//
//            try {
//                a = Double.valueOf(JOptionPane.showInputDialog("Input double number")); // if cancel then NULL
//                if (a < 0) {
//                    throw new MyException();
//                }
//                break; // exit
//            } catch (NumberFormatException e) {
//                JOptionPane.showMessageDialog(null, "Error number format");
//            } catch (NullPointerException e) {
//                JOptionPane.showMessageDialog(null, "Set default = 10");
//                a = 10;
//                break;
//            } catch (MyException e) {
//                JOptionPane.showMessageDialog(null, e.getMessage());
//            }
//        }
//        System.out.println(a);

        // inner use exception
        exceptionInnerUse(-8);
    }

    public static int factorial(int n) {
        return n <= 1 ? 1 : n * factorial(n - 1);
    }

    public static String binaryString(int n) {
        return Integer.toBinaryString(n);
    }

    public static void hashCodeWhat() {
        int hCode = (new Object()).hashCode(); // int
        System.out.println("hashCode = " + hCode);
    }

    public static void saveStrToFile(File file, String text) {

        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println(text);
        } catch (IOException e) {

        }
    }

    public static String loadStrFromFile(File file) {
        String text = "";
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                text += sc.nextLine() + System.lineSeparator();
            }
        } catch (IOException e) {

        }
        return text;
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

    public static void exceptionInnerUse(double radius) {
        if(radius < 0) {
            throw new IllegalArgumentException("my text !!!!!!!!!!!!");
        }
    }
}
