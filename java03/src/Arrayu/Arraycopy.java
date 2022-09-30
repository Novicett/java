package Arrayu;

public class Arraycopy {

	public static void main(String[] args) {
		// 기본데이터를 다른 변수에 복사
		int math = 100;
		int math2 = math;
		System.out.println("수학1: " + math);
		System.out.println("수학2: " + math2);
		math2=90;
		System.out.println("수학1: " + math);
		System.out.println("수학2: " + math2);
		
	}

}
