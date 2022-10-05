package 상속;

public class Personuse {

	public static void main(String[] args) {
		Person p = new Person();
		p.gender="남자";
		p.name="클라크";
		System.out.println(p);
		Man m = new Man();
		m.gender="남자";
		m.name="데이비드";
		m.size=100;
		System.out.println(m);
		
		Superman s = new Superman();
		s.gender="남자";
		s.name="윌리엄";
		s.size=200;
		System.out.println(s);
		s.fly(); //슈퍼맨
		s.run(); //맨
		s.eat(); //사람
		s.sleep(); //사람
		
		Woman w = new Woman();
		w.gender="여자";
		w.name="여자2";
		w.size=100;
		System.out.println(w);
		
		Superwoman ww = new Superwoman();
		ww.flyfly();
		ww.dance();
	}

}
