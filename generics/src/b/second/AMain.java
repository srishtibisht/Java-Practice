package b.second;

public class AMain {

	public static void main(String[] args) {

		ABoxMultiType<String, String> first = new ABoxMultiType<>();
		first.add("Humans", "Suck");
		
		System.out.println(first.getValueOfT()+" "+ first.getValueOfU());
		
		System.out.println("-------------------------------------------------");
		
		ABoxMultiType<Integer, Integer> second = new ABoxMultiType<>();
		second.add(2, 9);
		
		System.out.println(second.getValueOfT()+" "+ second.getValueOfU());


	}

}
