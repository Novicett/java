package Arrayu;

public class Arraycopy2 {

	public static void main(String[] args) {
		// 참조형 복사(주소가 복사, 얕은 복사)
		int[] n1 = { 100, 200, 300 };
		int[] n2 = n1;
		System.out.println("n1 :" + n1);
		System.out.println("n2 :" + n2);

		int[] n3 = n1.clone();
		System.out.println("n1 :" + n1);
		System.out.println("n3 :" + n3);
		System.out.println("값 변경하기 전 ===========");
		for (int i : n1) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i : n3) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("값 변경한 후");
		n3[0] = 999;
		for (int i : n1) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i : n3) {
			System.out.print(i + " ");
		}
	}

}
