package Succession;

class Person{
	private String regnumber;
	private double weight;
	protected int age;
	String name;
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Person [regnumber=" + regnumber + ", weight=" + weight + ", age=" + age + ", name=" + name + "]";
	}
}

class Student extends Person {
	int id;
}

public class SudentTest {
	public static void main(String[] args) {
		Student obj = new Student();
		obj.age = 21;
		obj.name = "kim";
		obj.setWeight(75.0);
		System.out.println(obj);
		System.out.println(obj.getWeight());
		
	}

}
