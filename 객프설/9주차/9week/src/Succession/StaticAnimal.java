package Succession;

class Animal3 {
	public static void A() {
		System.out.println("static method in Animal");
	}
}

public class StaticAnimal extends Animal3 {
	public static void A() {
		System.out.println("static method in Dog");
	}
	public static void main(String[] args) {
		StaticAnimal dog = new StaticAnimal();
		Animal3 a = dog;
		a.A();
		dog.A();
	}

}
