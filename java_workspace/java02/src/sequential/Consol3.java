package sequential;

import java.util.Scanner;

public class Consol3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("이름 입력>> ");
		String name=s.next();
		System.out.print("나이 입력>> ");
		int age=s.nextInt();
		System.out.print("취미 입력>> ");
		String play=s.next();
		System.out.println("---------------");
		
		System.out.println("나의 이름은 "+name);
		System.out.println("나의 나이는 "+age);
		System.out.println("나의 취미는 "+play);
		
	}

}
