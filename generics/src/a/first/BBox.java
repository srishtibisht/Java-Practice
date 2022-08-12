package a.first;

public class BBox<T, U> {

	private T t;
	private U u;

	public BBox(T t, U u) {
		this.t = t;
		this.u = u;
	}

	public void display() {
		System.out.println("CLASS NAME : " + t.getClass().getName() + " \tVALUE : " + t);
	}

	public <T> void displayGen(T ele) {
		System.out.println(ele.getClass().getName() + " : " + ele);
	}
}
