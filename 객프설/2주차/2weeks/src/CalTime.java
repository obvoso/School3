import java.util.Scanner;

public class CalTime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time;
		int min;
		int sec;
		
		System.out.print("초를 입력하시오. : ");
		time = sc.nextInt();
		
		min = time / 60;
		sec = time % 60;
		
		System.out.println(time + "초는 " + min + "분 " + sec + "초 입니다.");
		
	}

}
