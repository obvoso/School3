package Extends;

class Shape1 {
	
	public double getArea() {
		return 0;
	}
	
	public Shape1() {
		super();
	}
	
}

class Rectangle1 extends Shape1 {
	private double width, height;
	
	public Rectangle1 (double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	public double getArea() {
		return width * height;
	}
}

class Triangle1 extends Shape1 {
	private double base, height;
	
	public double getArea() {
		return 0.5 * base * height;
	}
	
	public Triangle1(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
 }


public class ShapeAreaTest {
	public static void main(String args[]) {
		Shape1 obj1 = new Rectangle1(10.0, 20.0);
		Shape1 obj2 = new Triangle1(10.0, 20.0);

		System.out.println("Rectangle: " + obj1.getArea());
		System.out.println("Triangle: " + obj2.getArea());

		
	}
	

}
