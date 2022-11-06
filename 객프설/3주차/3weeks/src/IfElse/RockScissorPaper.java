package IfElse;

import java.util.Scanner;

public class RockScissorPaper {
	final int SCISSOR = 0;
	final int ROCK = 1;
	final int PATER = 2;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(0) 바위(1) 보(2) : ");
		int user = sc.nextInt();
		
		int com = (int)(Math.random() * 3);
		if (user == com) {
			System.out.println("비겼습니다.");
		} else if (user == (com + 1)) {
			System.out.println("컴퓨터 : " + com + " 결과는 유저가 이겼습니다.");
		} else {
			System.out.println("컴퓨터 : " + com + " 결과는 유저가 졌습니다.");
		}
		
	}

}
