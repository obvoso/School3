package For;

import java.util.Scanner;

public class MinusOne {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		while (true) {
			System.out.print("정수를 입력하세요 : ");
			num = sc.nextInt();
			if (num == -1)
				break;
			sum += num;
		}
		System.out.println("정수의 합은 " + sum + "입니다.");
	}

}
