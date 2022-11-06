package Assignment;

public class Lab2 {
	
	public static float getKcal(int n) {
		float kcal;
		
		kcal = 5.179f;
		return (n * 180 * kcal);
	}
	
	public static void main(String args[]) {
		
		int n;
		float ret;
		
		n = 3;
		ret = getKcal(n);
		System.out.println("삼겹살 " + n + "인분의 칼로리: " + ret + "kcal");
	}

}
