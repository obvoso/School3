package Ex;

import java.util.Scanner;

public class Ex03 {
	
	static int	getTotal(int score[])
	{
		int ret = 0;
		int i = 0;
		
		while (i < 5)
			ret += score[i++];
		return (ret);
	}
	
	static double getAverage(int total)
	{
		return (total / 5);
	}
	
	public static void main(String[] args) {
		int i = 0;
		int score[] = new int[5];
		int total;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		while (i < 5)
		{
			System.out.print("성적을 입력하세요 : ");
			score[i] = sc.nextInt();
			++i;
		}
		total = getTotal(score);
		avg = getAverage(total);
		
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);	
	}
}
