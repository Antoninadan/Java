package uaimail100;

public class Main {

	public static void main(String[] args) {
		
		Phone phone1 = new Phone("067-123-23-22");
		Phone phone2 = new Phone("066-664-23-62");
		Phone phone3 = new Phone("099-999-29-29");
		
		Network network1 = new Network();
		
		phone1.regInNetwork(network1);
		phone2.regInNetwork(network1);
		
		phone1.call(network1, "066-664-23-62");
		phone1.call(network1, "055-555-55-65");
		phone1.call(network1, "099-999-29-29");
		
	//	network1.registrationPrint();
		
	}

}
