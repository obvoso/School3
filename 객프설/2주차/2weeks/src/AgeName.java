import java.util.Scanner;

public class AgeName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int	age;
		
		System.out.print("이름을 입력하시오: ");
		name = sc.next(); //nextLine은 줄단위, next는 공백문자까지
		
		System.out.print("나이를 입력하시오: ");
		age = sc.nextInt();
		
		System.out.println(name + "님 안녕하세요! " + age + "살이시네요.");
		
	}

}
