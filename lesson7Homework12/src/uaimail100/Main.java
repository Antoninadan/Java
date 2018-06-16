package uaimail100;

public class Main {

	public static void main(String[] args) {
		// Написать свой вариант метода Arrays.toString() для int[].

		int[] mas = { 1, 3, 5, 6, 6 };

		StringBuilder str = new StringBuilder("[");

		for (int element : mas) {
			str.append(element + ", ");
		}

		str.replace(str.length() - 2, str.length(), "]");

		System.out.println(str);
	}

}
