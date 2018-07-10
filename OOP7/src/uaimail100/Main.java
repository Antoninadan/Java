package uaimail100;

public class Main {

	public static void main(String[] args) {

		Ac action = new Ac();
		PushPull pull = new PushPull("Pull", action, true);
		PushPull push = new PushPull("Push", action, false);

		Thread threadOne = new Thread(pull);
		Thread threadTwo = new Thread(push);
		threadOne.start();
		threadTwo.start();
	}

}
