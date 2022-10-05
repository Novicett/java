package 정적;

public class Day {
	//객체생성시, 힙영역에 복사될 변수들
	//변수들에 해당 실제값이 들어감(실제변수, 인스턴스변수)                        
	String doing;
	int time;
	String location;
	static int count;
	public Day(String doing, int time, String location) {
		this.doing = doing;
		this.time = time;
		this.location = location;
		count++;
	}
	
	//객체생성후, 생성된 객체의 주소가 아니라,
	//그 주소가 가르키는 인스턴스변수의 값들을 가지고 String을 만들어주세요.!
	@Override
	public String toString() {
		return "나의하루 [하는일=" + doing + ", 한 시간=" + time + ", 위치=" + location + "]";
	}
	
	
}
