package uaimail100;

public class Receiver implements Runnable {
	private Action action;

	public Receiver(Action action) {
		super();
		this.action = action;
	}

	@Override
	public void run() {
		for (; !action.isStop();) {
			int number = action.getValue();
		}
	}
}
