package Ex;

public class PlaneTest {
	public static void main(String[] args) {
		Plane p1 = new Plane();
		Plane p2 = new Plane("에어버스", "A380", 500);
		Plane p3 = new Plane();
		
		p1.setCompany("보잉");
		p1.setModel("747");
		p1.setPassenger(400);
		
		p3.setCompany("보잉");
		p3.setModel("737");
		p3.setPassenger(800);
		
		System.out.println("식별번호 : 1 모델 : " + p1.getModel() + " 승객수 : " + p1.getPassenger());
		System.out.println("식별번호 : 2 모델 : " + p2.getModel() + " 승객수 : " + p2.getPassenger());
		System.out.println("식별번호 : 3 모델 : " + p3.getModel() + " 승객수 : " + p3.getPassenger());
		
		System.out.println("현재까지 생성 된 비행기의 개수 : " + Plane.getPlanes());
	}
}
