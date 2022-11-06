package Person;

class PizzaCnt {
	private String topping;
	private int radius;
	static final double PI = 3.141592;
	static int count = 0;

	public PizzaCnt(String topping) {
		this.topping = topping;
		++count;
	}
}


public class PizzaCntTest {
	public static void main(String args[]) {
		PizzaCnt p1 = new PizzaCnt("Super Supreme");
		PizzaCnt p2 = new PizzaCnt("Cheese");
		PizzaCnt p3 = new PizzaCnt("Pepperoni");
		int n = PizzaCnt.count;
		System.out.println("지금까지 판매된 피자 개수 : " + n);
		
	}

}
