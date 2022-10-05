package 스레드;

public class Trycatch {

	public static void main(String[] args) {
		System.out.println("1. 나는 프린트가 잘 될 예정");
		try {
			System.out.println("2. 문제발생 코드"+10/0);
		} catch (Exception e) {
			System.out.println("에러발생");
			System.out.println(e.getMessage());
		}
		
		System.out.println("3. 나는 과연 프린트가 될까요??");
	}

}
