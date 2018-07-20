package uaimail100;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Integer []  array = new Integer [1000];
		Random rn = new Random();
		for(int i =0; i< array.length; i++) {
			array[i] = rn.nextInt(100);
		}
		
		Map<Integer, Integer> stat = new HashMap<>();
		
		for(Integer element:array) {
			Integer counter = stat.get(element);
			if (counter == null) {
				stat.put(element, 1);
			} else {
				stat.put(element, counter+ 1);
			}			
		}				
		System.out.println(stat);  

	}

}
