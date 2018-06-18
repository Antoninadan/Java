package uaimail100;

public class Main {

	public static void main(String[] args) {
		// Vovochka

		String str1 = "123123"; // 123
		String str2 = "112112112112"; // 112
		String str3 = "121121121121121121121121"; // 121
		String str4 = "111111"; // 1
		String str5 = "121112111211"; // 1211

		System.out.println(str1.substring(0, perebor(str1)));
		System.out.println(str2.substring(0, perebor(str2)));
		System.out.println(str3.substring(0, perebor(str3)));
		System.out.println(str4.substring(0, perebor(str4)));
		System.out.println(str5.substring(0, perebor(str5)));

	}

	static int check(String str, String combination, int start) {
		int length = combination.length();

		String substr = str.substring(start, start + length);
		if (combination.equals(substr)) {
			return 1; // okey
		} else {
			return -1; // not suitable
		}
	}

	static int perebor(String str) {
		int length = str.length();
		String substr;
		int k;
		int result = 0;

		for (int i = 1; i <= length / 2; i++) {

			substr = str.substring(0, i);
			k = 0;
			for (int j = 1; j < length / i; j++) {

				if (check(str, substr, i * j) == -1) {
					break;
				} else {
					k++;
					if (k == (length / i - 1)) {
						return i;
					}
				}
			}
			result = -1;
		}
		return result;
	}

}
