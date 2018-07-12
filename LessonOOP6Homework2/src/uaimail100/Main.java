package uaimail100;

public class Main {

	public static void main(String[] args) {

		int n = 199999990; // size of massive
		int[] mas = new int[n];
		int sum = 0;

		for (int i = 0; i < n; i++) {
			mas[i] = i;
		}

		int parts = 2; // on what parts we can devide
		int k;
		
		if (parts * (n / parts) == n) {
			k = 0;
		} else {
			k = n - parts * (n / parts);
		}
		
		SumElements[] sums = new SumElements[parts];
		Thread[] threads = new Thread[parts];

		// devide mas into parts 
		int m = 0;
		for (int i = 1; i <= parts; i++) {
			if (m != (parts-1)) {
				sums[i - 1] = new SumElements(m * (n / parts), ((m + 1) * (n / parts) - 1), mas);

		} else {
				sums[i - 1] = new SumElements(m * (n / parts), (m + 1) * (n / parts) + k -1 , mas);
			}

			threads[i - 1] = new Thread(sums[i - 1], "mas " + (i - 1));
			m++;
		}

		// test Simple method
		long timeStart1 = System.currentTimeMillis();

		for (int l : mas) {
			sum += l;
		}

		long timeEnd1 = System.currentTimeMillis();

		System.out.println((timeEnd1 - timeStart1) + " ms" + "- Simple method");
		System.out.println("Result = " + sum);

		sum = 0;
		System.out.println();

		// test Second method
		long timeStart2 = System.currentTimeMillis();

		for (int i = 0; i < parts; i++) {
			threads[i].start();
			try {

				threads[i].join();
			} catch (InterruptedException e) {
			}

		}

		for (int i = 0; i < parts; i++) {
			sum += sums[i].getSum();
		}

		long timeEnd2 = System.currentTimeMillis();

		System.out.println((timeEnd2 - timeStart2) + " ms" + "- Second method");
		System.out.println("Result = " + sum);

	}
}
