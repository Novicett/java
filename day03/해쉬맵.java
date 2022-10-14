package day03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class 해쉬맵 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap();

		// 객체 삽입하기
		map.put("a", 100);
		map.put("b", 200);
		map.put("c", 300);
		map.put("d", 100);

		// 객체 검색하기
		System.out.println(map.get("b"));
		System.out.println(map.get("d"));

		// 모든 값을 다 출력하기
		// 1단계 key만 모은다.
		Set KeySet = map.keySet();
		Iterator<String> it = KeySet.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.print(key + " ");
			System.out.print(map.get(key) + " ");
		}
	}

}
