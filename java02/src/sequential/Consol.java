package sequential;

import java.util.Scanner;
public class Consol {

	public static void main(String[] args) {
		//Scanner를 새롭게 만들어서
		//이클립스의 콘솔뷰에서 입력을 받아보자.!!
		Scanner s = new Scanner(System.in);
		
		//Scanner는 입력하기 전에 무엇을 입력할 지
		//먼저 프린트를 해주세요.!
		System.out.print("이름을 입력: ");
		String name =s.next();//입력을 받음.String!!
		System.out.println("입력받은 이름은 "+name+" 입니다.");
		
		System.out.print("소속을 입력:");
		String com=s.next();
		System.out.println("입력받은 소속은 "+com+"");
	}

}