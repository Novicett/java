package day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class 리스트 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList(); //배열을 대신해서 사용하는 컬렉션
		a.add("AA");
		a.add("BB");
		a.add(1,"CC");
		a.add("AA");
		a.add("DD");
	
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		a.remove("DD");
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i)+"~~");
		}
		
		List<String> a1= Arrays.asList("11","22","33","44");
		
		for (String k : a1) {
			System.out.print(k+" ");
		}
	}

}
