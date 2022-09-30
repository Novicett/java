package Arrayu;

import java.util.Iterator;

public class Arraymany {

	public static void main(String[] args) {
		// 배열 여러개를 응용해서
		// 다양한 타입의 데이터를 넣어보자.

		String[] family = { "아버지", "어머니", "나" };
		int[] age = { 100, 50, 20 };
		double[] height = { 177.7, 132.2, 155.3 };

		// 나에 대한 정보만 프린트해보세요
		// 인덱스 2번에 나에 대한 정보가 들어있음.

		System.out.println(family[2] + " " + age[2] + " " + height[2] + " ");
		
		//우리 식구 모두 프린트해보기
		
		for (int i = 0; i < height.length; i++) {
			System.out.println(family[i]+" "+age[i]+" "+height[i]);
			System.out.println();
		}
	}

}
