// use IllegalArgumentException
package uaimail100;

public class Main {

	public static void main(String[] args) {
		System.out.println(calcArea(1));
		System.out.println(calcArea(-1));
		
		
		
	}

	public static double calcArea(double radius) {
		if(radius < 0) {
			throw new IllegalArgumentException("<0");  // i catch problem, good practice, dont catch IllegalArgumentException, because its special 
		}
		return Math.PI * Math.pow(radius, 2);
	} // for link its good practice - NULL

	
	
	
}
