package condi;

import java.util.Date;

public class Con4 {

	public static void main(String[] args) {
		Date date = new Date();
		int hours = date.getHours();

		if (hours >= 0 && hours < 11) {
			System.out.println("굿모닝");
		} else if (hours >= 11 && hours < 15) {
			System.out.println("굿애프터눈");
		} else if (hours >= 14 && hours < 19) {
			System.out.println("굿이브닝");
		} else {
			System.out.println("굿나잇");
		}
	
	}

}
