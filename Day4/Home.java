package Day4;

import java.util.Scanner;

public class Home {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("name �Է�");
	String name = sc.next();
	System.out.println("age �Է�");
	int age = sc.nextInt();
	System.out.println("email �Է�");
	String email = sc.next();
	Member m = new Member();
	m.setName(name);
	m.setAge(age);
	m.setEmail(email);
	System.out.println("��ϵ� ���� [�̸�] "+m.getName+" [����] "+m.getAge+" [�̸���]"+m.getEmail+"));		
	
	

}
}
