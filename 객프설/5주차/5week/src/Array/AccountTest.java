package Array;

public class AccountTest {
	public static void main(String args[]) {
		Account obj = new Account();
		obj.setName("Soo");
		obj.setBalance(100000);
		System.out.println("이름은 " + obj.getName() + " 통장 잔고는 " + obj.getBalance());
	}

}
