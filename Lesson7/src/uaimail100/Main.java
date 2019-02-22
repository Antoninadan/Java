package uaimail100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

public class Main {

	public static void main(String[] args) {
		
		Date date = new Date();
//		System.out.println(date);
//		
//		long t = 122312323L; // UTC
//		
//		Date date2 = new Date(t);
//		System.out.println(date2);
//		
//		// SimpleDateFormat sdfOne = new SimpleDateFormat("'today is '"); // ' gdfjkgdfj'
//		SimpleDateFormat sdfOne = new SimpleDateFormat("'today is 'G yyyy MMMM W D z"); // codes
		
		// parse in format + view
		SimpleDateFormat sdfTwo = new SimpleDateFormat("dd:MM:yyyy"); // need !!!!!
		String myDate = "11:10:1981"; // 
		
		try {
			date = sdfTwo.parse(myDate);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		String dateText3 = sdfTwo.format(date);
		
		System.out.println(dateText3);
		System.out.println(date.getTime());
		
		
		
		
//		
//		String dateText = sdfOne.format(date);
//		String dateText2 = sdfTwo.format(date);
//		
//		System.out.println(dateText);
//		System.out.println(dateText2);
		
		try {

			int a = 5 / 0;
			int[] mas = new int[7];
			mas[9] = 1;

		} catch (ArithmeticException e) {
			System.out.println("error = " + e);
		} catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println("error = " + e2);
		}
		
		System.out.println("Work with calendar:");
		
		// Calendar
		
		Calendar cl = Calendar.getInstance();
		
		cl.set(Calendar.YEAR, 1981);
		cl.set(Calendar.MONTH, Calendar.OCTOBER);
		cl.set(Calendar.DAY_OF_MONTH, 11);		
		
		Date date4 = cl.getTime();
		System.out.println(date4);
		
		System.out.println("Work with string:");
		
		// String
		
		StringBuffer sb = new StringBuffer ("My string"); // multi stream!!!
		sb.append(" world");
		System.out.println(sb);
		
		StringBuilder sbu = new StringBuilder ("My string"); // one stream!!!
		sbu.append(" world"); // append
		System.out.println(sbu);
		
		sbu.setCharAt(6, '6'); // swip
		System.out.println(sbu);
		
		sbu.insert(6, 'Q'); // insert
		System.out.println(sbu);
		
		sbu.reverse(); // reverse
		System.out.println(sbu);
		
		sbu.delete(2, 4); // delete
		System.out.println(sbu);
		
		sbu.replace(2, 4, "^&***"); // delete
		System.out.println(sbu);		
		
		String text = sbu.toString(); // convert to sting
		System.out.println(text);
		
		System.out.println("Formatter: ");
		
		// Formatter - not easy
		//Formatter fr = new Formater();
		
		// Easty formatter
		
		String result = String.format("Pi = %f %.2f ", Math.PI, Math.PI); 
		
		System.out.println(result);
		
		double ddd=34523.345236;
		System.out.println(doubleToString(ddd, 2));
		
		// format for String  !!!!!!!!!!!
		
		String str2 = "123456";
//		System.out.println(%);
		
		// bit only for Integer
		
		int n=3; // 0000 0011
		int m=5; // 0000 0101
		
		System.out.println(n|m); // or 
		System.out.println(n&m); // and
		System.out.println(n^m); // xor
		System.out.println(~n); // not
		
		int k = 5;
		System.out.println(k << 3);  // 0000 0101 -> kill zero add zerro   = k * 2 Pow3
		System.out.println(k >> 1);  // 0000 0101 -> add zerro kill zero    = k / 2 Pow1
		
				
	}

	public static String doubleToString(double number, int n) {  /// !!!!!!!!!!
		String result = String.format("%."+ n +"f", number); 
		return result; 
	}
	
	
}
