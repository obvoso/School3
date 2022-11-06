package Assignment;

public class Lab01 {
	
	public static int getVolume(int n) {
		return (n * n * n);
	}
	
	public static void main(String args[]) {
		int	n;
		int	v;
		
		n = 3;
		v = getVolume(n);
		System.out.println("한 변의 길이가 " + n + "인 정육면체의 부피 : " + v);
	}

}
