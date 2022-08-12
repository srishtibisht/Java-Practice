package a.first;

public class AMain {

	public static void main(String[] args) {

		ABox<Integer> intData = new ABox<>();
		intData.add(1);

		ABox<String> strData = new ABox<>();
		strData.add("Srishti");

		Integer res1 = intData.get();
		System.out.println("When T is Integer : " + res1);

		String res2 = strData.get();
		System.out.println("When T is String : " + res2);
	}

}
