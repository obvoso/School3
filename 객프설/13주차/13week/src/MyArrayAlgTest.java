
class MyArrayAlg {
	public static <T> T getLast(T[] a) { //무슨 형이든 받겠다. return T
		return a[a.length - 1];
	}
}


public class MyArrayAlgTest {

	public static void main(String[] args) {
		String[] languge = {"C++", "C#", "JAVA"};
		String last = MyArrayAlg.getLast(languge);
		System.out.println(last);
	}

}
