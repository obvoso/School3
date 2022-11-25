package Interface;

interface RemoteControl1 {
	void turnOn();
	void turnOff();
}

public class AnonymousClassTest {
	public static void main(String args[]) {
		//익명클래스
		RemoteControl1 ac = new RemoteControl1() {
			public void turnOn() {
				System.out.println("TV turnOn()");
			}
			public void turnOff() {
				System.out.println("TV turnOff()");
			}
		}; 
		//익명 클래스를 만들때 정의되면서 동시에 객체도 생성되기 때문에 세미콜론
		ac.turnOn();
		ac.turnOff();
	}

}
