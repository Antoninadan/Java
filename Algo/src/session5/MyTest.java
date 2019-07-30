package session5;

public class MyTest {
    public static void main(String[] args) {
//        doubl();

        // test sequence
        System.out.print("Sequence: ");
        sequenceDigitsFromN2K(5, 10);
        System.out.println();
        System.out.println();

        // test max mas
        int[] ints = {1, 2, 5000, 1, 4, 23, 2500};
        System.out.println("maxMas = " + maxMas(ints, 0, Integer.MIN_VALUE));
        System.out.println();

        // test the sum of the digits of the number
        int number = 88888;
        System.out.println("sum of digits for " + number + " = " + sumDigitsOfNumber(number, 0));
        System.out.println();

        // test Palindrom
        String str1 = "Янукович вивчив окуня";

        System.out.println(str1 + " - palindrom = " + isPalindrom(str1));

        String str2 = "Янукович вивчив 1окуня";
        System.out.println(str2 + " - palindrom = " + isPalindrom(str2));

        String str3 = "А мене нема";
        System.out.println(str3 + " - palindrom = " + isPalindrom(str3));

    }

    public static void doubl() {
        System.out.println("1");
        doubl();
        doubl();
    }

    // sequence-----------------------------------------------------------------------------------------------
    public static void sequenceDigitsFromN2K(int n, int k) {
        if (n > k) return;
        System.out.print(n + " ");
        sequenceDigitsFromN2K(n + 1, k);
    }

    // max mas------------------------------------------------------------------------------------------------
    public static int maxMas(int[] mas, int currentN, int max) {
        if (currentN > mas.length - 1) {
            return max;
        }

        if (mas[currentN] >= max) {
            return maxMas(mas, currentN + 1, mas[currentN]);
        }

        return maxMas(mas, currentN + 1, max);
    }

    // sumDigitsOfNumber--------------------------------------------------------------------------------------
    public static int sumDigitsOfNumber(int number, int sum) {
        String stringNumber = Integer.toString(number);
        int firstChar2Int = Character.digit(stringNumber.charAt(0), 10);

        if (stringNumber.length() == 1) {
            return sum + firstChar2Int;
        }

        int stringNumberLength = stringNumber.length();
        String newStringNumber = stringNumber.substring(1, stringNumberLength);
        int newIntStringNumber = Integer.parseInt(newStringNumber);

        return sumDigitsOfNumber(newIntStringNumber, sum + firstChar2Int);
    }

    // isPalindrom--------------------------------------------------------------------------------------
    public static boolean isPalindrom(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();

        Character firstChar = str.charAt(0);
        Character lastChar = str.charAt(str.length() - 1);

        if ((str.length() == 1) || (str.length() == 0)) {
            return true;
        } else if (firstChar.equals(lastChar)) {
            int stringNumberLength = str.length();
            String newStringNumber = str.substring(1, stringNumberLength - 1);
            return isPalindrom(newStringNumber);
        } else {
            return false;
        }

    }
}

