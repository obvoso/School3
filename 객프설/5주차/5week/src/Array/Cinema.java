package Array;

public class Cinema {
	public static void main(String[] args) {
		
		int[][] seats = { {0, 0, 0, 1, 1, 0, 0, 0, 0, 0} ,
							{0, 0, 1, 1, 0, 0, 0, 0, 0, 0} ,
							{0, 0, 0, 0, 0, 0, 1, 1, 1, 0} };
		
		int cnt = 0;
		
		for (int i = 0; i < seats.length; i++)
			for (int j = 0; j < seats[i].length; j++)
				cnt += seats[i][j];
		System.out.print("현재 관객수는 " + cnt + "명 입니다.");
				
	}

}
