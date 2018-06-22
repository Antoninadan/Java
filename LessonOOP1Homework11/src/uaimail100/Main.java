package uaimail100;

public class Main {

	public static void main(String[] args) {

		Cat catOne = new Cat("Murka", 5, 2);
		Cat catTwo = new Cat("Barsik", 2, 3);
		Cat catThree = new Cat("Kotik", 10, 4);

		catOne.setDayPortion(1);
		System.out.println("Purchase for a week = " + catOne.calculateFeedPurchases(7));

		System.out.println("catTwo: " + catTwo.toString());
		
		catThree.meow();
	}

}
