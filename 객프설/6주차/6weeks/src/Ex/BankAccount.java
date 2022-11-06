package Ex;

public class BankAccount {
	private int	balance;
	
	BankAccount() {
		this.balance = 0;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void depasit(int b) {
		int before;
		int	after;
		
		before = getBalance();
		after = before + b;
		setBalance(after);
	}
	public void withdraw(int b) {
		int	before;
		int after;
		
		before = getBalance();
		after = before - b;
		setBalance(after);
	}
	public static void transfer(BankAccount from, BankAccount to, int b) {
		System.out.println("transfer(" + b + ")");
		from.withdraw(b);
		to.depasit(b);
	}
	@Override
	public String toString() {
		return ("현재 잔액은 " + getBalance() + "입니다.");
	}
	public static void main(String[] args) {
		BankAccount myAccount1 = new BankAccount();
		BankAccount myAccount2 = new BankAccount();
		
		myAccount1.depasit(10000);
		System.out.println("myAccount1 : " + myAccount1);
		System.out.println("myAccount2 : " + myAccount2);
		BankAccount.transfer(myAccount1, myAccount2, 1000);
		System.out.println("myAccount1 : " + myAccount1);
		System.out.println("myAccount2 : " + myAccount2);
	}
}
