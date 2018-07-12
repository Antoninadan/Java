package uaimail100;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		Cat catOne = new Cat("Vaska", 5, true);
		Cat catTwo = new Cat("Vaska", 5, true);
		Cat catThree = catTwo;
		System.out.println(catOne.hashCode());
		System.out.println(catTwo.hashCode());

		System.out.println(catOne.equals(catTwo));
		System.out.println(catThree.equals(catTwo));

		Cat cat5 = null;

		try {
			cat5 = catTwo.clone();
		} catch (CloneNotSupportedException e) {
		}

		System.out.println("catTwo == cat5   " + (catTwo == cat5));
		System.out.println("catTwo.equals(cat5)   " + catTwo.equals(cat5));

		System.out.println(cat5.getName());
		cat5.setName("dcdsc"); // QUESTION!!!!!!!!
		System.out.println(catTwo.getName());

		// Class
		System.out.println();

		Class catClass = Cat.class;

		System.out.println(catClass);

		Class catClass2 = catOne.getClass();

		System.out.println(catClass2);

		// Field
		Field[] catField = catClass.getDeclaredFields();

		for (Field f : catField) {
			System.out.println(f);
		}

		System.out.println();

		// Method
		Method[] catMethods = catClass.getDeclaredMethods();

		for (Method f : catMethods) {
			System.out.println(f);
		}

		// Constructor
		Constructor<?>[] catConstructor = catClass.getDeclaredConstructors();

		for (int i = 0; i < catConstructor.length; i++) {
			System.out.println(catConstructor[i]);
		}

		// to redesign
		Field catAge;
		try {
			catAge = catClass.getDeclaredField("age");
			catAge.setAccessible(true);
			catAge.setInt(catOne, 10500);
		} catch (SecurityException | IllegalArgumentException | IllegalAccessException | NoSuchFieldException e) {

		}
		System.out.println(catOne);

		// save and read
		File file=new File("myCat.txt");
		try {
			SerService.saveObject(file, catOne);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Cat cat6 = null;
		try {
			cat6 = (Cat) SerService.loadObject(file);
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(cat6);
	}

}
