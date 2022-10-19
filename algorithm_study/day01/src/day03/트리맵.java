package day03;

import java.util.Map;
import java.util.TreeMap;

public class 트리맵 {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap();
		scores.put(87, "a");
		scores.put(98, "b");
		scores.put(75, "c");
		scores.put(95, "d");
		scores.put(80, "e");
		scores.put(87, "f");
		
		TreeMap<Integer, String> scores2 = new TreeMap();
		scores2.put(87, "a");
		scores2.put(98, "b");
		scores2.put(75, "c");
		scores2.put(95, "d");
		scores2.put(80, "e");
		scores2.put(87, "f");
		
		Map.Entry<Integer, String> entry = null;
		entry=scores.firstEntry();
		System.out.println("가장 낮은 점수 "+entry.getKey()+" "+entry.getValue());
		
		entry=scores.lastEntry();
		System.out.println("가장 높은 점수 "+entry.getKey()+" "+entry.getValue());
		
		
		
		while(!scores.isEmpty()) {
			entry=scores.pollFirstEntry();
			System.out.print(entry+" ");
		}
		System.out.println();
		
		while(!scores2.isEmpty()) {
			entry=scores2.pollLastEntry();
			System.out.print(entry+" ");
		}
		
		
	
		
		
	}

}
