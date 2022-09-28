package sequential;


import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;



public class Consol2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//입력: 나이
		System.out.print("나이 입력 >> ");
		int age=s.nextInt();//String으로 입력을 받아서 정수로 변환!~
		
		//처리
		int age2=age+1;
		//출력
		System.out.println("내년나이는 "+age2+"세 입니다");
		

	}

}
