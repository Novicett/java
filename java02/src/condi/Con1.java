package condi;

import java.util.Scanner;

public class Con1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("암호를 대시오:");
		String pw=s.next();
		
		if(pw.equals("pass")) {
			System.out.println("들어오세요.");
		}else {
			System.out.println("나가세요.");
		}
		
	}

}
