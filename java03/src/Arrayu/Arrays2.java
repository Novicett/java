package Arrayu;

import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num[] = new int[5];

		for (int i = 0; i < num.length; i++) {
			num[i] = s.nextInt();
		}
		System.out.println(num[0] + num[2]);

		String java[] = { "자바", "스프링", "JSP" };
		System.out.println(java[0] + "보다는" + java[1]);
	}

}
