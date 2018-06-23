package uaimail100;

public class Network {

	private String[] masNumber = new String[1000]; 
	private Phone[] masPhone = new Phone[1000]; 
	private int phoneCount = 0; 

	
	public Network() {
		super();
	}

	
	public void phoneRegistration(Phone phone) { 
		masPhone[phoneCount] = phone;
		masNumber[phoneCount] = phone.getNumber();
		phoneCount++;
	}

	
	public boolean isCalledPhone(Network network, String number) {
		boolean result = false;
		for (int i = 0; i < phoneCount; i++) {
			if (masNumber[i] == number) {
				masPhone[i].takeCall();
				result = true;
			}
		}
		return result;
	}
}
