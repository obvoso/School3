
public class Pizza {
	public static void main(String [] args) {
		final double PI = 3.141592; 
		
		double area1 = 2 * PI * 20 * 20;
		double area2 = PI * 30 * 30;
		
		System.out.println("20cm 피자 면적 = " + area1);
		System.out.println("30cm 피자 면적 = " + area2);
		System.out.println((area1 > area2) ? "20cm 두개" : "30cm 한개");
	}

}
