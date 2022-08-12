package b.second;

public class BBoxArrayEx<T, S> {

	private T t;
	private S s;

	public BBoxArrayEx(T t, S s) {
		this.t = t;
		this.s = s;
	}

	public T valueOfT() {
		return t;
	}

	public S valueOfS() {
		return s;
	}
}
