package uaimail100;

public class Main {

	public static void main(String[] args) {
/*		Car carOne = new Car();
		// Integer a=128;
		// Integer b=128;
		// System.out.println(a==b); // dont use
		Car carTwo = new Car();
		
		//carTwo = carOne;
		//System.out.println(carTwo);
		
		carOne.color = "Red";
		carOne.weight = 40;
		carOne.year = 2006;
		
		carOne.print();
		System.out.println();
		
		carTwo.color = "fdg";
		carTwo.weight = 4430;
		carTwo.year = 25006;
		
		carTwo.print();
		
//		Car carFour = carTwo;
//		carFour.print();
		
		///carTwo.velosity = 25006; dont 
		*/
		
/*		// this
		Car carOne = new Car();
		carOne.setYear(23453);
		carOne.print();
		
		Car carTwo = new Car();
		carTwo.setYear(456);
		carTwo.print();
		*/
		
		Car carOne = new Car("hjgjh", 455, 2009);
	//	carOne.print();
		
		carOne.setYear(666);
		System.out.println(carOne.getYear());
		
	Car [] mas = new Car [10];
		
		System.out.println(carOne); // without toString()
		System.out.println(mas); 
	}

}
