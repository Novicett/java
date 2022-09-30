package Arrayu;

import java.util.Scanner;

public class Phone {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("전화번호입력>>");
		String tel = sc.next();

		// 첫번째 문자열이 011이면 sk, 019이면 lg, 나머지이면 apple
		String tel2 = tel.substring(0, 3);

		if (tel2.equals("011")) {
			System.out.println("통신사 SK");
		} else if (tel2.equals("019")) {
			System.out.println("통신사 LG");
		} else {
			System.out.println("통신사 Apple");
		}

		// 두번째 문자열이 4개 이상이면 최신폰, 아니면 올드폰
		String tel3 = tel.substring(4, 8);
		String s2 = "-";
		if (tel3.contains(s2)) {
			System.out.println("올드폰");
		} else {
			System.out.println("최신폰");
		}

		// 전체 전화번호의 길이가 10글자 이상이면 유효한전화번호 아니면 유효하지 않은 전화번호
		if (tel.length() >= 12) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지 않은 전화번호");
		}

		String s = "감자,고구마,양파";
		String[] s3 = s.split(","); // , 기준으로 해서 String배열을 만들어준다.
		System.out.println(s3[0]);

		String[] s4 = tel.split("-");
		if (s4[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}

	}
}