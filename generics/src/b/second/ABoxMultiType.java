package b.second;

public class ABoxMultiType<T, U> {

	private T t;
	private U u;

	public void add(T t, U u) {
		this.t = t;
		this.u = u;
	}

	public T getValueOfT() {
		return this.t;
	}

	public U getValueOfU() {
		return u;
	}

}
