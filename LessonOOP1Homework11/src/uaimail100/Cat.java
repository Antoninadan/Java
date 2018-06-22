package uaimail100;

public class Cat {
	private String name;
	private int age;
	private int dayPortion;

	public Cat() {
		super();
	}

	public Cat(String name, int age, int dayPortion) {
		super();
		this.name = name;
		this.age = age;
		this.dayPortion = dayPortion; // number of feed cans a day
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getDayPortion() {
		return dayPortion;
	}

	public void setDayPortion(int dayPortion) {
		this.dayPortion = dayPortion;
	}

	// calculation of feed purchases
	public int calculateFeedPurchases(int daysNumber) {
		return dayPortion * daysNumber;
	}

	public void meow() {
		System.out.println("Meow-Meow!!!");
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", dayPortion=" + dayPortion + "]";
	}

}
