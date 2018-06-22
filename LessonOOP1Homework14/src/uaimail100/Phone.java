package uaimail100;

public class Phone {
	private String number;

	public Phone() {
		super();
	}
		

	public Phone(String number) {
		super();
		this.number = number;
	}


	public void regInNetwork(Network network) {
		network.phoneRegistration(this.number);
	}

	
	public void call(Network network, String number) {

		if (network.isPhoneRegistrated(number)) {
			System.out.println("Calling " + number + " ..");
		} else {
			System.out.println("Number " + number + " is not registrated in network");
		}
	}

}
