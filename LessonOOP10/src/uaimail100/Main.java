package uaimail100;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Map<Integer, String> myMap = new HashMap<>();
		
		myMap.put(1, "one");
		myMap.put(5, "five");
		myMap.put(3, "three");
		myMap.put(4, "four");
		
		System.out.println(myMap);  // resort hashcode key
		
		String text = myMap.get(5);
		System.out.println(text);
		
		String text2 = myMap.get(10);
		System.out.println(text2);
		
		myMap.put(1, "ONE");
		System.out.println(myMap);
		
		String text3 = myMap.put(1, "ONE1111");
		System.out.println("ghtl" + text3);
		
		myMap.remove(1);
		System.out.println(myMap);
		
		String text4 = myMap.remove(3);
		System.out.println(text4);
		
		System.out.println();
		
		// print
		Set<Integer> keySet = myMap.keySet();
		
		for(Integer k:keySet) {
			System.out.println(k + " " + myMap.get(k));
		}
		
		System.out.println();
		
		// forEach
		myMap.forEach((key,value) -> System.out.println(key + " " + value));
		
		
		// 
		
		
	}

}
