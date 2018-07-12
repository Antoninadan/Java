package uaimail100;

public class SumElements implements Runnable {

	private int from;
	private int to;
	private int[] mas;
	private int sum = 0;

	public SumElements() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public SumElements(int from, int to, int[] mas) {
		super();
		this.from = from;
		this.to = to;
		this.mas = mas;
	}


	public int getSum() {
		return sum;
	}


	@Override
	public void run() { // what i want to work in concurrency
		Thread thr = Thread.currentThread();

		for (int i = from; i <= to; i++) {
			this.sum += mas[i];
		}
		
	}
}
