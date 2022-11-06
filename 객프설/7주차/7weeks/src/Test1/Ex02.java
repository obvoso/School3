package Test;

class Circle {
	
	private int x;
	private int y;
	private int radius;
	
	Circle() {
		this.x = 0;
		this.y = 0;
		this.radius = 0;
	}
	
	Circle(int x, int y, int r) {
		super();
		this.x = x;
		this.y = y;
		this.radius = r;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void move(int dx, int dy) {
		this.setX(this.getX() + dx);
		this.setY(this.getY() + dy);
	}

	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", radius=" + radius + "]";
	}
}

public class Ex02 {

	public static void main(String[] args) {
		Circle c = new Circle(10, 10, 5);
		System.out.println(c + "\n");
		c.move(10, 20);
		System.out.println("move() 호출 후 ");
		System.out.println(c);
	}
}
