package For;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		String res;
		
		System.out.print("정수를 입력하세요 : ");
		num = sc.nextInt();
		switch(num) {
		case 1 : res = "ONE"; break;
		case 2 : res = "TWO"; break;
		case 3 : res = "THREE"; break;
		case 4 : res = "FOUR"; break;
		case 5 : res = "FIVE"; break;
		case 6 : res = "SIX"; break;
		case 7 : res = "SEVEN"; break;
		case 8 : res = "EIGHT"; break;
		case 9 : res = "NINE"; break;
		default : res = "OTHER"; break;
		}
		System.out.println(res);
	}
}
