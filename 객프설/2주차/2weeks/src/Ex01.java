import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int orange;
		int box = 10;
		int	div;
		int	mod;
		
		System.out.print("오랜지의 개수를 입력하시오: ");
		orange = sc.nextInt();
		
		div = orange / box;
		mod = orange % box;
		
		System.out.println(div + "박스가 필요하고 " + mod + "개가 남습니다.");
		
	}

}
