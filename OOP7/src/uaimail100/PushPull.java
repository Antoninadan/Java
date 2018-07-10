package uaimail100;

public class PushPull implements Runnable {
	private String text;
	private Ac action;
	private boolean turn;

	public PushPull(String text, Ac action, boolean turn) {
		super();
		this.text = text;
		this.action = action;
		this.turn = turn;
	}

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			action.printText(text, turn);
		}

	}

}
