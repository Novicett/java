package condi;

import java.util.Date;

public class Con5 {

	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth();
		int month2=month+1;
		switch (month2) {
		case 2:
			System.out.println("28일까지");
			break;
		case 4:
		case 6:
		case 7:
		case 11:
			System.out.println("30일까지");
			break;

		default:
			System.out.println("31일까지");
			System.out.println(month2);
			break;
		}
	}

}
