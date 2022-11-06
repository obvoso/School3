package Ex;

import java.util.Scanner;

public class Ex02 {
	static int[] seat = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	
	static void print() {
		int i = 0;
		System.out.println("------------------------");
		while (i < 10) {
			System.out.print(i++ + " ");
		}
		System.out.println("");
		System.out.println("------------------------");
		i = 0;
		while (i < 10) {
			System.out.print(seat[i++] + " ");
		}
		System.out.println("");
		System.out.println("------------------------");
	}
	
	static void reserve(int n) {
		seat[n] = 1;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int	seat_num;
		
		Ex02.print();
		System.out.println("몇번째 좌석을 예약하시겠습니까? ");
		seat_num = sc.nextInt();
		Ex02.reserve(seat_num);
		System.out.println("예약되었습니다.");
		Ex02.print();
	}
}
