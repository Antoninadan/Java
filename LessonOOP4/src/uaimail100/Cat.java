package uaimail100;

public class Cat implements Play, Comparable {
	private String name;
	private int age;

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}





	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean canPlay() {
		return true;
	}

	@Override
	public String play() {
		if (2 <= 2 ) {
			return "Run!";
		} else {
			return "Eat!";
		}
	}

	@Override
	public int compareTo(Object o) {

		Cat another = (Cat) o;
		
		if(this.age > another.age) {
			return 1;
		} else if (this.age < another.age) {
			return -1;
		} else {	
		return 0;}
	}
	
	
	
}
