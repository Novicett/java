package classuse;

import classmake.Bank;

public class Bankuse {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.name="홍길동";
		b.money=1000;
		b.bank="튼튼적금";
		b.input();
		b.output();
		Bank b2 = new Bank();
		b2.name="홍길명";
		b2.money=2000;
		b2.bank="쿠쿠적금";
		b2.input();
		b2.output();
	}

}
