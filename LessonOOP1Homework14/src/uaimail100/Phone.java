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
	
	
	public String getNumber() {
		return number;
	}

	
	public void regInNetwork(Network network) {
		network.phoneRegistration(this);
	}

	
	public void takeCall() {
		System.out.println("Number " + number + " takes call");
	}
	
	
	public void call(Network network, String number) {

		if (network.isCalledPhone(network, number)) {
			
		} else {
			System.out.println("Number " + number + " is not registrated in network");
		}
	}

	
	
}
