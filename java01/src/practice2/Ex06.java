package practice2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;import java.util.Map;
import java.util.Vector;

public class Ex06 {

	public static void main (String[] args) {
		//collection api 
		ArrayList<String> e = new ArrayList<String>();
		e.add("사과");
		e.add("대중");
		e.add("지금");
		e.add("아아 ");
		
		Iterator<String> a = e.iterator(); // 모든 객체 리턴
		 
		while (a.hasNext()) {
			System.out.println(a.next());
		}
		
		//동기화란 - 어려명이 접근할 때 
		// arraylist == vector 백터는 동기화 
		
		Vector<String> b = new Vector<String>();
		
		b.addElement("zz");
		b.add("1");
		
		HashMap<String, String> name = new HashMap<String, String>();
		//키와 값
  	}
}

