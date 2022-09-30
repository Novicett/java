package condi;

import java.util.Date;

public class Switch2 {

	public static void main(String[] args) {
		// f2
		Date date = new Date();
		int month = date.getMonth() + 1;
		int day = date.getDay(); // 요일
		// 0이 일요일, 1이 월요일, 6이 토요일

		switch (day) {
		case 0:
		case 6:
			System.out.println("놀자.");
			break;

		default:
			System.out.println("자바 공부하러 가자.");
			break;
		}
		//계절을 판별해보세요.
		switch (month) {
		case 3: case 4: case 5:
			System.out.println("봄이에요");
			break;
		case 6: case 7: case 8:
			System.out.println("여름 이에요");
			break;
		case 9: case 10: case 11:
			System.out.println("가을 이에요");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울 이에요");
			break;

		default:
			break;
		}
	}
	
	
	
}

