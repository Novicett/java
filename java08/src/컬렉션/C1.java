package 컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class C1 {

	public static void main(String[] args) {
		HashSet a = new HashSet();
		a.add("디자이너");
		a.add("프로그래머");
		a.add("DB관리자");
		System.out.println(a);
		
		LinkedList b = new LinkedList();
		b.add("어제우유");
		b.add("오늘우유");
		b.add("내일우유");
		b.remove();
		System.out.println(b);
		
		ArrayList c = new ArrayList();
		c.add("박스키");
		c.add("송스키");
		c.add("김스키");
		c.add("정스키");
		c.remove("송스키");
		System.out.println(c);
		
		HashMap d = new HashMap();
		d.put(1, "엄마");
		d.put(2, "아빠");
		d.put(3, "친구");
		d.put(4, "동생");
		System.out.println(d.get(2));
		
	}

}
