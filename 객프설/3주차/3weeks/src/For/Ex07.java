package For;

public class Ex07 {
	public static void main(String[] args) {
		System.out.print("2부터 100사이 모든 소수 : ");
		for (int i = 2; i <= 100; i++) {
			
			if ((i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) ||
					i == 2 || i == 3 || i == 5 || i == 7)
				System.out.print(i + " ");
		}
	}

}
