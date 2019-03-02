import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] mas1 = arrayIntRandom(100);
//        int[] mas2 = arrayIntInput(2);

    }

    public static int[] arrayIntRandom(int n) {

        int[] mas = new int[n];

        Random rn = new Random();

        for (int i = 0; i < mas.length; i++) {
            mas[i] = 10000 + rn.nextInt(20000); // from 10000 to 30000
        }

        System.out.println(Arrays.toString(mas));
        return mas;
    }

    public static int[] arrayIntInput(int n) {

        int[] mas;
        Scanner sc = new Scanner(System.in);
        int size = n;
        mas = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Input " + i + "- element:");
            mas[i] = sc.nextInt();
        }

        System.out.println("Your massive: " + Arrays.toString(mas));
        return mas;
    }



}
