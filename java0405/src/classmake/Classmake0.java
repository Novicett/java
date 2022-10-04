package classmake;

public class Classmake0 {
	// 공통적인 성질: 사이즈, 스피커
	// ==> 변수를 사용, 2개의 변수 필요
	// ==> 멤버변수, 값을 넣지않음 선언만!
	// ==> 자동초기화시켜줌
	public int size; // 0으로 자동 초기화!
	public String speaker; // ""으로 자동 초기화!
	// 자동초기화시켜주는 것 ==> 맴버변수, 배열
	// 동작(기능)을 정의: 통화하다, 사진을 찍다
	// 멤버메서드(함수)
	public void call() { // 통화하다.
		// 처리내용을 순서대로 써준다...
		System.out.println("전화기로 통화하다.");
	}
	public void pic() { // 사진을 찍다.
		// 처리내용을 순서대로 써준다...
		System.out.println("전화기로 셀카를 찍다.");
	}

}
