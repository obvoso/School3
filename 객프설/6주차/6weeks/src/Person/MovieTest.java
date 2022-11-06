package Person;

import java.util.Scanner;

class Movie {
	String title;
	double rating;
	String director;
	int year;
	
	Movie(String n, String m, int o, double e) {
		super();
		this.title = n;
		this.rating = e;
		this.director = m;
		this.year = o;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", rating=" + rating + ", director=" + director + ", year=" + year + "]";
	}
	
}

public class MovieTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("제목 : ");
		String t = sc.nextLine();
		System.out.print("감독 : ");
		String d = sc.nextLine();
		System.out.print("연도 : ");
		int y = sc.nextInt();
		System.out.print("평점 : ");
		double r = sc.nextDouble();
		Movie movie1 = new Movie(t, d, y, r);
		System.out.println(movie1);
	}

}
