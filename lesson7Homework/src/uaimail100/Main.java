package uaimail100;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		/*Написать программу которая вернет количество миллисекунд
		прошедших от такого же числа, но в прошлом месяце до сегодняшней
		даты. Например если сегодня 3 августа, то узнать сколько миллисекунд
		прошло с 3 июля.*/

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd.MM.yyyy");

		Calendar call = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();

		Date date1 = call.getTime(); // current date

		int month = call.get(Calendar.MONTH); // month of current date

		cal2.set(Calendar.MONTH, (month - 1));
		Date date2 = cal2.getTime();

		long difference = date1.getTime() - date2.getTime();

		System.out.println("Date 1 = " + sdf1.format(date1));
		System.out.println("Date 2 = " + sdf1.format(date2));
		System.out.println("Difference = " + difference);
	
				
	}

}
