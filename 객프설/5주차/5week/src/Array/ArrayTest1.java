package Array;

public class ArrayTest1 {

	public static void main(String[] args) {
		int [] s = new int[10]; // int s[] = new int[10]; 도 
		
		for (int i = 0; i < s.length; i++) {
			s[i] = i;
		}
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
	}
}
