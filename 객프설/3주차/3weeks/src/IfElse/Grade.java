package IfElse;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int	score;
		
		System.out.print("점수를 입력하세요 : ");
		score = sc.nextInt();
		
		System.out.print("학점 : ");
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80 && score < 90) {
			System.out.println("B");
		} else if (score >= 70 && score < 80) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
	}

}
