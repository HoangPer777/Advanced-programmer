package MCV;

public class model {
	private int couter;

	public model() {
		super();
		this.couter = 0;
	}

	public int getCouter() {
		return couter;
	}

	public void setCouter(int couter) {
		this.couter = couter;
	}

	public void increment() {
		this.couter++;
	}

	public void decrement() {
		this.couter--;
	}

	public void reset() {
		this.couter = 0;
	}
}
