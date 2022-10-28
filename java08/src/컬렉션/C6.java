package 컬렉션;

import java.util.HashMap;

public class C6 {

	public static void main(String[] args) {
		HashMap h = new HashMap();
		h.put(100, "김데이");
		h.put(200, "김사전");
		h.put(300, "김구조");
		h.put(400, "김자료");
		System.out.println(h);
		h.remove(200);
		h.put(300, "김충성");
		System.out.println(h);
	}

}
