package Array;

import java.util.Scanner;

public class NumberGame {
	public static void main(String args[]) {
		int answer = 59;
		int guess = 0;
		Scanner sc = new Scanner(System.in);
		
		int tries = 0;
//		do {
//			System.out.println("정답을 추측하여 보시오 : ");
//			guess = sc.nextInt();
//			tries++;
//			
//			if (answer < guess)
//				System.out.println("제시한 정수가 높습니다.");
//			else if (answer > guess)
//				System.out.println("제시한 정수가 낮습니다.");
//		} while (guess != answer);
//		System.out.println("축하합니다. 시도횟수=" + tries);
		while (answer != guess) {
			System.out.print("정답을 추측하여 보시오 : ");
			guess = sc.nextInt();
			tries++;
			
			if (answer < guess)
				System.out.println("제시한 정수가 높습니다.");
			else if (answer > guess)
				System.out.println("제시한 정수가 낮습니다.");	
		}
		System.out.println("축하합니다. 시도횟수=" + tries);
	}

}
