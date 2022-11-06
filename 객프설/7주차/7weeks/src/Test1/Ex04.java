package Test;

class Car{
	
	private String model;
	private String make;
	static int numberOfCars = 0;
	
	Car()
	{
		this.model = null;
		this.make = null;
		++numberOfCars;
		System.out.println("자동차 1대 생산, 누적 생산량 = " + getNumberOfCars() + "대");
	}
	Car(String model, String make) {
		super();
		this.model = model;
		this.make = make;
		++numberOfCars;
		System.out.println("자동차 1대 생산, 누적 생산량 = " + getNumberOfCars() + "대");
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	static int getNumberOfCars() {
		return (numberOfCars);
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Car c1 = new Car("k5", "kim");
		Car c2 = new Car("k4", "lee");
		Car c3 = new Car("k3", "park");
		Car c4 = new Car("k2", "choi");
		Car c5 = new Car();
	}
}
