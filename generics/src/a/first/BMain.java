package a.first;

import java.util.ArrayList;

public class BMain {
	public static void main(String[] args) {

		BBox<Integer, String> box1 = new BBox<Integer, String>(29, "Srishti");
		box1.display();
		box1.displayGen(10.0);

		System.out.println("-----------------------------");
		BBox<String, Double> box2 = new BBox<String, Double>("Coding", 10.0);
		box2.display();
		box2.displayGen("Hello");

		System.out.println("----------------------------\n");
		System.out.println("Advantages of Generics");

		ArrayList list = new ArrayList<>();
		list.add("One");
		list.add("Two");
		list.add(3);

		String s0 = (String) list.get(0);
		System.out.println("Value of list at index 0 : " + s0);

		String s1 = (String) list.get(1);
		System.out.println("Value of list at index 1 : " + s1);

//		String s2 = (String) list.get(2);
//		System.out.println("Value of list at index 2 : " + s2);

//		System.out.println(box1.getClass() == box2.getClass());

	}

}
