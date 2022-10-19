package day01;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		int sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("정수입력");
		int num =s.nextInt();
		
		if (num%2==0) {
			sum=(num+1)*(num/2);
			System.out.println(sum);
		}
		if(num%2!=0) {
			sum=(num+1)*(num/2)+(num+1)/2;
					System.out.println(sum);
		}
	}

}
