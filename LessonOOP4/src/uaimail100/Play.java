package uaimail100;

public interface Play {
	// переменные неявно final static
	public boolean canPlay();  // can
	public String play();     // how to play

	default int sum(int a, int b){
		return a+b;
	}

	static void printHello(){
		System.out.println("Hello");
	}
}
