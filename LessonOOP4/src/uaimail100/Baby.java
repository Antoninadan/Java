package uaimail100;

public class Baby {
	private String name;
	private int age;
	
	public Baby(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Baby() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Baby [name=" + name + ", age=" + age + "]";
	}
	
	public String playWith(Play someThing) {
		String result = "I want to play" + someThing;
		
		if (!someThing.canPlay()) {
			result += System.lineSeparator() + ":(";
		} else {
			result += System.lineSeparator() + ":) " + someThing.play();
		}
		
		return result;
	}
}
