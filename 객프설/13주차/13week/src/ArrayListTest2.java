import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		
		ArrayList<String>list = new ArrayList<>();
		list.add("Apple");
		list.add("Orange");
		list.add("Mango");
		list.add("Banana");
		list.add("Grape");
		
		int idx = list.indexOf("Mango");
		System.out.println("Mango의 위치 : " + idx);

	}

}
