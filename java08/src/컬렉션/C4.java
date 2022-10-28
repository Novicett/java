package 컬렉션;

import java.util.LinkedList;

public class C4 {

	public static void main(String[] args) {
		LinkedList q = new LinkedList();
		q.add("국어");
		q.add("수학");
		q.add("영어");
		q.add("컴퓨터");
		System.out.println("전체 시험볼 과목:" + q);
		for (int i = 0; i <= q.size(); i++) {
			q.remove();
			System.out.println((i+1)+"일차 :"+"전체 시험볼 과목:" + q);

		}

	}

}
