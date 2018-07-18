package uaimail100;

public class Main {

	public static void main(String[] args) {

		SomeClass<Integer> a = new SomeClass(120);
		System.out.println(a);
		print(a);

		SomeClass<String> b = new SomeClass("string");
		System.out.println(b);
		print(b);

		// a.setSomeField("120");

		// int number = (Integer) a.getSomeField() + 25;
		int number = a.getSomeField() + 25;
		System.out.println(number);
		

		Integer[] arrayInteger = new Integer[] { 1, 4, 5, 6 };
		System.out.println(min(arrayInteger));

		// int[] arrayInt = new int[] {1,4, 5,6}; // int dont want
		// System.out.println(min(arrayInt));

		String[] arrayString = new String[] { "1", "4", "5", "6" };
		System.out.println(min(arrayString));

		x();
	}

	public static <T extends Comparable<T>> T min(T[] array) {
		T min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min.compareTo(array[i]) > 0) {
				min = array[i];
			}
		}
		return min;
	}

	public static <T extends Comparable<T>> void x() {
		System.out.println("reter"); // without sense
	}

	public static void print(SomeClass<? extends Comparable<?>> a) {
		System.out.println(a); // without sense
	}
	
	
}
