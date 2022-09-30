package repetition;

import java.util.Scanner;

public class Num0 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0;
		int count2 = 0;

		while (true) {
			System.out.print("숫자입력1>> ");
			int num = s.nextInt();
			System.out.print("숫자입력2>> ");
			int num2 = s.nextInt();
			if (num > num2) {
				System.out.println("앞 숫자가 더 큽니다.");
				count++;
			} else if (num == num2) {
				System.out.println("숫자가 동일함");

			} else {
				System.out.println("뒷 숫자가 더 큽니다.");
				count2++;
			}
			System.out.print("종료할까요?(x) 계속할까요?(o)");
			String rel = s.next();
			char rel2 = rel.charAt(0);
			if (rel2 == 'x') {
				System.out.println("게임을 종료");
				System.out.println("앞 숫자가 더 큰 횟수 :"+count);
				System.out.println("뒷 숫자가 더 큰 횟수 :"+count2);
				System.exit(0);
			} else {
				continue;
			}

		}

	}

}
