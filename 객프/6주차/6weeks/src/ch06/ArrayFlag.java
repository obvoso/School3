package ch06;

public class ArrayFlag {
	public static void main(String[] args) {
		double average = (double)442/7;
		double x = average % 1;
		System.out.println(average);
		System.out.println(x);
		System.out.println(60 * (average % 1));
		System.out.printf("평균 : %d분 %.0f초 \n", (int)average, 60 * x);
	}

}
