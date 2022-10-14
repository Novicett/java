package day03;

import java.util.NavigableSet;
import java.util.TreeSet;

public class 트리셋 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet();
		scores.add(87);
		scores.add(88);
		scores.add(98);
		scores.add(75);
		scores.add(80);
		scores.add(85);
		System.out.println("가장 낮은 점수 "+scores.first());
		System.out.println("가장 높은 점수 "+scores.last());
		System.out.println("95점 아래 점수 "+scores.lower(95));
		System.out.println("95점 위 점수 "+scores.higher(95));
		NavigableSet<Integer> desendingSet=scores.descendingSet();
		for (Integer Score1 : desendingSet) {
			System.out.print(Score1+" ");
		}
		System.out.println();
		NavigableSet<Integer> desendingSet1=desendingSet.descendingSet();
		for (Integer score1:desendingSet1) {
			System.out.print(score1+" ");
		}
	}

}
