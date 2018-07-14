package uaimail100;

public class Main {

	public static void main(String[] args) {

		Ac ac = new Ac();
		PushPull pull = new PushPull(" Pull", ac, true);
		PushPull push = new PushPull("Push", ac, false);

		Thread threadOne = new Thread(pull);
		Thread threadTwo = new Thread(push);
		threadOne.start();
		threadTwo.start();

		// receiver - provider

		Action action = new Action();
		Provider provider = new Provider(action);
		Receiver receiver = new Receiver(action);
		Thread threadThree = new Thread(provider);
		Thread threadFour = new Thread(receiver);
		threadThree.start();
		threadFour.start();
	}

}
