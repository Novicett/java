package 생성자;

public class Mask {
	// 멤버변수(역할), 전역변수(범위), 인스턴스(객체생성후실제)
	String color; // "", 참조형변수(저장타입)
	int price;// 0, 기본형변수
	int count;// 0, 기본형변수
	// 멤버변수는 전역변수, 전역변수는 자동초기화가 된다.
	// 멤버변수의 원본은 클래스원본영역에 저장
	// 멤버변수는 객체생성될 때, 힙 영역에 복사가 된다.

	// 객체생성후, 멤버변수값을 나중에 넣어도 상관없는 경우
	// 생성자 만들어주지 않아도 된다.

	public Mask() {

	}

	public Mask(String color, int price, int count) {
		this.color = color;
		this.price = price;
		this.count = count;
	}

	public Mask(String color) {
		this.color = color;
	}
	// 계좌처럼 파라메터없이 객체 생성하고 싶고,
	// 파라메타 있는 객체생성하고 싶은 경우
	// 기본생성자를 명시적으로 써주어야함.

	@Override
	public String toString() {
		return "Mask [color=" + color + ", price=" + price + ", count=" + count + "]";
	}

}
