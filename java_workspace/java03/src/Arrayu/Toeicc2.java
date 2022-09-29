package Arrayu;

import java.util.Iterator;
import java.util.Random;

public class Toeicc2 {

	public static void main(String[] args) {
		// 1. 답안지, 대답안 공간만들어라
		int answer[]=new int[990];
		int answer2[]= new int[990];
		// 2. 랜덤하게 만들어주는 부품을 만들어라.
		Random r = new Random();
		// 3. 990번 반복해서 답안지, 대답안에 숫자를 넣어라
		// 1~4범위
		for (int i = 0; i < answer2.length; i++) {
			answer[i]=r.nextInt(4)+1;
			answer2[i]=r.nextInt(4)+1;
		}
		// 4. 같은 인덱스 끼리 990번 비교
		int count=0;
		for (int i = 0; i < answer2.length; i++) {
			if (answer[i]==answer2[i]) {
				count++;
			} 
		}
		// 비교하다가 숫자가 동일하면 점수를 1늘려주세요,
		System.out.println(count);

		// 5. 내 점수 프린트
	}

}
