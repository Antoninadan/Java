package uaimail100;

public class Network {

	private String[] phoneReg = new String [1000];
	private int phoneCount = 0;
	
	
	public Network() {
		super();
	}


	public void phoneRegistration(String number) {
		phoneReg[phoneCount] = number;
		phoneCount++;
	}

	
	public boolean isPhoneRegistrated(String number) {
	
		for (int i=0; i < phoneCount; i++) {
			if(phoneReg[i] == number) {
				return true; 
			}
		}
		return false; 
	}
	
	
}
