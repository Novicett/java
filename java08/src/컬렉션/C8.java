package 컬렉션;

import java.util.ArrayList;
import java.util.List;

public class C8 {
//generic == general <---> specific, special
	public static void main(String[] args) {
		// 클래스를 만들 때 데이터타입을 정하지 않고 
		// 일반적인(특정하지 않은) 형태로 만들어놓음.
		// 데이터타입은 객체생성시 데이터타입을 정할 수 있음.
		ArrayList<String> e = new ArrayList();
		e.add("스트링1");
		e.add("스트링2");
		e.add("스트링3");
		e.add("스트링4");
		System.out.println(e);
		
		ArrayList<Integer> e1 = new ArrayList<Integer>();
		e1.add(100);
		e1.add(200);
		e1.add(300);
		e1.add(400);
		e1.add(500);
		e1.add(600);
		System.out.println(e1);
		
	}

}
