package sequential;

import java.util.Scanner;

public class Consol4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("나의 이름은? ");
		String name=s.next();
		System.out.print("나이 키는? ");
		double height=s.nextDouble();
		double height2=height+11.0;
		System.out.print("나의 몸무게는? ");
		double pig=s.nextDouble();
		double pig2=pig-10.0;
		System.out.print("나는 저녁을 먹었나요? ");
		boolean dinner=s.nextBoolean();
		s.nextLine();
		System.out.print("나의 좌우명은? ");
		String good=s.nextLine();
		System.out.println("---------------");
		
		System.out.println("내 이름은 "+name);
		System.out.println("내 내년 키는 "+height);
		System.out.println("내 내년 몸무게는 "+pig);
		System.out.println("나는 저녁을  "+dinner+"했습니다.");
		System.out.println("나의 좌우명은 "+good+" 입니다.");
		
	}

}
