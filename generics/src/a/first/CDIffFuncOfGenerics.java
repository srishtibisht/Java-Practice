package a.first;

public class CDIffFuncOfGenerics {

	public static void main(String[] args) {

		CDIffFuncOfGenerics main = new CDIffFuncOfGenerics();

		Integer arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Display Integer Array : ");
		printArray(arr1);

		Double arr2[] = { 11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17.0, 18.0, 19.0, 20.0 };
		System.out.println("Display Double Array : ");
		printArray(arr2);

		Character arr3[] = { 'a', 'b', 'c', 'd', 'e' };
		System.out.println("Display Character Array : ");
		printArray(arr3);

	}

	public static <T> void printArray(T t[]) {
		for (T res : t) {
			System.out.print(res + "  ");
		}
		System.out.println("\n----------------------------------");
	}

}
