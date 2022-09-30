package Arrayu;

import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
		// 키보드로 입력하는 부품을 ram에 가져다 놓음
		Scanner s = new Scanner(System.in);

		int[] num = new int[5];//{0,0,0,0,0}
		for (int i = 0; i < 5; i++) {
			System.out.print("숫자입력>> ");
			num[i]= s.nextInt(); // 외부입력은 모두 String,
									// nextInt() String->int
		}
		int sum =0;
		for (int i : num) {
			//System.out.println(i);
			sum=sum+i;
		}
		System.out.println(sum);
		System.out.println(sum/5.0);
		// System.out.println("저장된 데이터는 " + data);
	}

}
