package uaimail100;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Integer[] masInteger = new Integer[] { 2, 2, 3, 4, 5, 6, 7, 7, 9, 10 };
		Map<Integer, Integer> statInteger = getStatistics(masInteger);
				
		String[] masString = new String[] { "a", "b", "c", "b", "a", "f", "g", "h", "b", "a" };
		Map<String, Integer> statString = getStatistics(masString);

	}
	
	public static <T> Map<T, Integer> getStatistics(T[] array) {
		Map<T, Integer> stat = new HashMap<>();

		for (T element : array) {
			Integer counter = stat.get(element);
			if (counter == null) {
				stat.put(element, 1);
			} else {
				stat.put(element, counter + 1);
			}
		}
		
		System.out.println(stat);  
		return stat;
	}

}
