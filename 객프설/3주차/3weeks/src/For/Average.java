package For;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		int total = 0, cnt = 0;
		int grade;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("정수를 입력하세요 : ");
			grade = sc.nextInt();
			if (grade < 0) break;
			total += grade;
			++cnt;
		}
		System.out.println("평균은 " + (total / cnt));
	}

}
