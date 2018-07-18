/*Написать метод, который создаст список, положит в него 10
элементов, затем удалит первые два и последний, а затем выведет
результат на экран.*/

package uaimail100;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Integer[] masInteger = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String[] masString = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };

		List<Integer> listMasInteger = create(masInteger);
		//System.out.println(listMasInteger);

		List<String> listMasString = create(masString);
		//System.out.println(listMasString);

	}

	public static <T> List<T> create(T[] mas) {
		List<T> myList = new ArrayList<>();
		int l = mas.length;

		for (int i = 0; i < l; i++) {
			myList.add(mas[i]);
		}

		myList.remove(0);
		myList.remove(0);
		myList.remove(myList.size() - 1);
		
		System.out.println(myList);

		return myList;
	}

}
