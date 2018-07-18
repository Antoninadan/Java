package uaimail100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> myList = new ArrayList<>();
		myList.add("A");
		myList.add("B");
		System.out.println(myList);

		myList.add(1, "C");
		System.out.println(myList);

		System.out.println("myList.get(1) = " + myList.get(1));

		myList.remove(1);
		System.out.println(myList);

		myList.set(0, "sdfasdf");
		System.out.println(myList);

		// for each
		for (String s : myList) {
			System.out.println(s);
		}
		System.out.println();

		// Iterator
		Iterator<String> itr = myList.iterator();

		for (; itr.hasNext();) {  // for delete!!!!!
			String element = itr.next();
			if (element.equals("B")) {
				itr.remove();
			}
			System.out.println(element);
		} // need to be new

		System.out.println(myList);
		
		
		//QUEUE
		
		//COMPARATOR
		myList.add("A");
		myList.add("B");
		System.out.println(myList);
		
		Collections.swap(myList, 0, 1);
		System.out.println(myList);
		
		Collections.sort(myList);
		System.out.println(myList);
		
			
		

	}

}
