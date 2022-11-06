package For;

import java.util.Scanner;

public class Yacksoo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int	num;
		
		System.out.print("양의 정수를 입력하시요 : ");
		num = sc.nextInt();
		for(int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
