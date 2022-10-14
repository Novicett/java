package day01;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//입력
		System.out.println("양의 정수를 입력");
		int a=s.nextInt();
		int count=0;
		while(a>0) {
			a=a/10;
			count++;
		}
		System.out.println("그 수는 "+count+"자리 입니다.");
	}

}
