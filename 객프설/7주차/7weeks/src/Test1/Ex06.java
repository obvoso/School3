package Test;

import java.util.ArrayList;
import java.util.Scanner;

class Contacts {
	
	String name;
	String tel;
	String email;
	static int count = 0;
	
	Contacts(){
		name = null;
		tel = null;
		email = null;
		++count;
	}
	
	Contacts(String n, String t, String e) {
		super();
		this.name = n;
		this.tel = t;
		this.email = e;
		++count;
	}
	
	static int retCount() {
		return (count);
	}
}

public class Ex06 {
	public static void main(String[] args) {
		ArrayList<Contacts> cArr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String name;
		String tel;
		String email;
		String searchName;		
		
		System.out.println("연락처를 입력하시오(종료 -1)");
		for (int i = 0; i < 100; i++) {
			System.out.print("이름을 입력하세요 : ");
			name = sc.nextLine();
			if (name.equals("-1"))
				break;
			System.out.print("전화번호를 입력하세요 : ");
			tel= sc.nextLine();
			System.out.print("이메일을 입력하세요 : ");
			email = sc.nextLine();
			Contacts c = new Contacts(name, tel, email);
			cArr.add(c);
		}
		System.out.println("지인들의 수는 " + Contacts.retCount() + "명 입니다.");
		System.out.print("검색할 이름을 입력하시오 : ");
		searchName = sc.nextLine();
		
		for(Contacts c : cArr) {
			if (c.name.equals(searchName))
			{
				System.out.print(searchName + "전화번호 : " + c.tel + "이메일" + c.email);
				break;
			}
		}
	}
}
