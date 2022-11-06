package For;

public class Ex03 {
	public static void main(String[] args) {
		int div;
		int mod;
		for (int i = 1; i <= 50; i++) {
			div = i / 10;
			mod = i % 10;
			if (div == 3 && ((mod % 3) == 0 && mod != 0))
				System.out.print("짝짝 ");
			else if ((mod != 0 && mod % 3 == 0) || div == 3)
				System.out.print("짝 ");
			else
				System.out.print(i + " ");
		}
	}

}
