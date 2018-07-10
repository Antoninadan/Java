package uaimail100;


// SHIT
public class Action {
	private boolean turn = false;

	public Action() {
		super();
	}

	public synchronized void setValue() {
		for (; turn == false;) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		turn = false;
		notifyAll();
	}

	public synchronized void getValue() {
		for (; turn == true;) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		turn = true;
		notifyAll();
	}

}
