package uaimail100;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
//		int[] a = { 5, 6, 7 };
//		System.out.println(a);
//		//2 type
//		int array1[]; // только для С
//		int[] array2; // java style !!!!!!!!
//
//		array2 = new int[2];
//
//		double[] array3 = new double[] { 3, 0, -5, 8 };
//
//		for (int i = 0; i < 2; i++)	{
//			System.out.println(array2[i]);
//		}
//				
//		System.out.println(array3.length);
//		System.out.println("array3 = " + array3);
//		
//		int[] a; // link
		
//		int[] a = new int[] {1, 2, 8, 89, 90};
//		int[] b = new int[4];
//		
//		b = a;
//		
//		for (int i = 0; i < b.length; i++)	{
////			System.out.println(b[i]);
////		}
//		
//		int[] c = new int[] {1, 2, 8, 89, 90};
//		int[] d = new int[4];
//		
//		System.arraycopy(c, 0, d, 0, d.length);
		
//		int[] c = new int[] { 1, 2, 8, 89, 90 };
//		int[] d = new int[4];
//		System.out.println(Arrays.toString(c)); // [1, 2, 8, 89, 90]
//		
//		int[] f = Arrays.copyOfRange(c, 1, 3);
//		System.out.println(Arrays.toString(f)); // Warrning!!!! last index needs +1
//		
//		if (f == c) {
//			System.out.println("equal"); //ссылочные данные не сравнивать!!!
//		}
//		
//		// сортировка
//		int[] g = new int[] {5,3,6,7,8,8,7};
//
//		Arrays.sort(g);
//		System.out.println(Arrays.toString(g));
//
//		// filling
//		Arrays.fill(g, 6);
//		System.out.println(Arrays.toString(g));
	
//		//foreach  - токо получение!!!
//		int summa = 0;
//		for (int element:g) {
//			summa = summa + element;
//		}
//		System.out.println(summa); 
		
//		// fill random
//		int[] pay = new int[12];
//
//		Random rn = new Random();
//
//		for (int i = 0; i < pay.length; i++) {
//			pay[i] = 10000 + rn.nextInt(20000); // from 10000 to 30000
//		}
//
//		System.out.println(Arrays.toString(pay));
//
//		int summa = 0;
//
//		for (int element : pay) {
//			summa += element;
//		}
//
//		System.out.println("Average = " + summa / pay.length + " UAH");
//	}
		
//		// !!!!!!!!!!!!!!!!!
//		
//	int[][] hh = new int[][];
//	
//	hh = {{2,3,4},{4,6,7}};
//	
//	System.out.println(Arrays.toString(p));
//	
//	for (int i = 0; i < hh.length; i++) {
//		for (int j = 0; j < hh[0].length; j++) {
//			System.out.println(hh[i][j]);
//		}
//		}
		
		String str = "dfghdf";
		str += "34534546345745";
		System.out.println(str);
		
		char[] t = str.toCharArray();
		
		System.out.println(t[0]);
		
		String a = "Hello";
		String b = "Hello";		
		
		System.out.println(a==b);
		
		String aa = "Hello";
		String bb = "Hell";		
		bb += 'o';
		
		System.out.println(aa==bb); // DONT DO IT
		
		System.out.println(aa.equals(bb)); // ok!!!!
		
		System.out.println(aa.indexOf("ll")); // ok!!!!
		
		System.out.println(aa.substring(0, 3)); // ok!!!!
	
		String cc = "113,345, 4354";	
		
		System.out.println(Arrays.toString(cc.split("[,]"))); // ok!!!!
		
	}
	
}
