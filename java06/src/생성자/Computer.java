package 생성자;

public class Computer {
	int price;
	String company;
	int size;
	public Computer(int price, String company, int size) {
		this.price=price;
		this.company=company;
		this.size=size;
	}
	//c는 주소가 들어있음
	//컴퓨터 클래스에 toString()을 메서드를 생성해주면
	//주소를 프린트할 때 toString()메서드가 자동 호출되어
	//return한 스트링을 주소대신에 프린트 해준다.
	//주소가 가르키는 힙영역의 멤버변수값들을 프린트!!
	public String toString(){
		return "가격= "+ price+" 제조회사= "+company +" 모니터크기= "+size;
	}
}
