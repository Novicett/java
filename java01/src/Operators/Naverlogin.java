package Operators;

public class Naverlogin {

	public static void main(String[] args) {
		int id = 1111;
		int pw = 2222;

		int id2 = 1111;
		int pw2 = 3333;
		
		if((id==id2) &&(pw==pw2)) { //기본형은 연산자를 이용해서 값을 비교할 수 있다.!
			// 시간복잡도와 공간복잡도를 줄이기 위해서 &&연산자일 때 맨앞에 false 가능성이 높인거 먼저 !!
		
			System.out.println("로그인 성공"); 
		}else
			System.out.println("로그인 실패");
	}

}
