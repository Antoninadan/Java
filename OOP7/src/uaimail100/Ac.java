package uaimail100;

public class Ac {

	private boolean turn = true;

	public synchronized void printText(String text, boolean turn) {

		for (; this.turn == turn;) {

			try {
				wait();
			} catch (InterruptedException e) {
			}
		}

		System.out.println(text + "  ");
		this.turn = !this.turn;

		notifyAll();

	}
}
