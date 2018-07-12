package uaimail100;

import java.math.BigInteger;

public class Factorial implements Runnable {
	private int number;

	public Factorial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Factorial(int number) {
		super();
		this.number = number;
	}

	public BigInteger calculateFactorial(int n) {
		BigInteger factorial = new BigInteger("1");
		for (int i = 2; i <= n; i++) {
			factorial = factorial.multiply(new BigInteger("" + i));
		}
		return factorial;
	}

	@Override
	public void run() { // what i want to work in concurrency
		Thread thr = Thread.currentThread();
		System.out.println(thr.getName() + " " + " ! = " + calculateFactorial(number));
	}
}
