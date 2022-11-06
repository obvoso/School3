import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time;
		
		System.out.print("시간 간격을 입력하시오(단위 : 초): ");
		time = sc.nextInt();
		System.out.println("번개가 발생한 곳 까지의 거리 : " + (time * 340));
	}

}
