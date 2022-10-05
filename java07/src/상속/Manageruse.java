package 상속;

public class Manageruse {

	public static void main(String[] args) {
		Staff s = new Staff();
		s.name="홍길동";
		s.address="해운대";
		s.salary=1000000;
		s.rrn=330;
		System.out.println(s);
		
		Manager m = new Manager();
		m.name="홍길이";
		m.address="강남";
		m.salary=30000000;
		m.rrn=331;
		m.bonus=300;
		System.out.println(m);
		m.test();
	}

}
