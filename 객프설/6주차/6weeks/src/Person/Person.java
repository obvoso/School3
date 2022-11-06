package Person;

class Person1 {
	String name;
	String  mobile;
	private String office;
	private String email;
	
	Person1() {
		this(null, null, null, null);
	}
	
	Person1(String n, String m, String o, String e) {
//		super();
		
		this.name = n;
		this.mobile = m;
		this.office = o;
		this.email = e;
	}
	
	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	@Override
	public String toString() {
		return "Person [name=" + name + ", mobile=" + mobile + ", office=" + office + ", email=" + email + "]";
	}

}

public class Person {
	public static void main(String args[]) {
		Person1 person1 = new Person1("김김김", "010-2343-3412", "02-3423-2222", "kim@cuk.ac.kr");
		Person1 person2 = new Person1("박박박", "010-1111-1111", "02-3423-2222", "park@cuk.ac.kr");
		Person1 person3 = new Person1();
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
	}
}
