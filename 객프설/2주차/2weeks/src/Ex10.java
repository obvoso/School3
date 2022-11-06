import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int weight;
		int speed;
		double ret;
		
		System.out.print("물체의 무게를 입력하시오(킬로그램) : ");
		weight = sc.nextInt();
		
		System.out.print("물체의 속도를 입력하시오(미터/초) : ");
		speed = sc.nextInt();
		
		ret = 0.5 * weight * speed * speed;
		System.out.println("물체는 " + ret + ("(줄)의 에너지를 가지고 있다."));
		
	}
}
