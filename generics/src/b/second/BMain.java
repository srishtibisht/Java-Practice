package b.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BMain {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<>();
		sList.add("One");
		sList.add("Two");
		sList.add("Three");
		sList.add("Four");
		sList.add("Five");

		BBoxArrayEx<Integer, List<String>> main1 = new BBoxArrayEx<Integer, List<String>>(5, sList);

		System.out.println(main1.valueOfT());

		System.out.println("--------------------------------");

		System.out.println(main1.valueOfS());

		System.out.println("--------------------------------");

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Double> list2 = Arrays.asList(1.1, 2.1, 3.1, 4.1, 5.1);

		System.out.println("Sum of Integer list : " + sum(list1));

		System.out.println("--------------------------------");

		System.out.println("Sum of Double list : " + sum(list2));
	}

	public static double sum(List<? extends Number> numList) {
		double sum = 0.0;
		for (Number res : numList) {
			sum = sum + res.doubleValue();

		}
		return sum;
	}

}
