package day03;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class 링크리스트 {

   public static void main(String[] args) {
    List<Integer> link = new LinkedList();
    link=Arrays.asList(1,2,3,4,5,6,1); //삽입삭제가 빈번하게 일어마녀 링크드 리스트
    for (int a : link) {
		System.out.print(a+" ");
	}
    Iterator<Integer> it=link.iterator();
    while(it.hasNext()) {
    	System.out.print(it.next()+" ");
    }
   }

}

