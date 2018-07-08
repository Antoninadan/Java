package uaimail100;

import java.math.BigInteger;

public class FactorialTask implements Runnable{
	private int number;

	public FactorialTask() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FactorialTask(int number) {
		super();
		this.number = number;
	}

	public BigInteger calculateFactorial (int n) {
		BigInteger factorial = new BigInteger("1");
		for(int i=2; i<=n; i++) {
			factorial = factorial.multiply(new BigInteger(""+i));
		}
		return factorial;
	}

	@Override
	public void run() { // what i want to work in concurrency
		Thread thr = Thread.currentThread();
		for (int i = 1; i <= number; i++) {
			System.out.println(thr.getName()+" " + i + " ! = " + calculateFactorial(i));
			
			if(thr.isInterrupted()) {
				System.out.println(thr.getName() + " is interrapted");
				break;
			}
		}
		
	}
	
	
}
