package 정적;

public class Day3 {
	String study;
	int clock;
	String place;
	static int count;
	
	Day3(String study,int clock,String place){
		this.study=study;
		this.clock=clock;
		this.place=place;
		count+=clock;
		
	}
	
	//일반메서드는 객체생성후, 주소로 접근해서 호출해야한다.
	//일반메서드는 객체생성후, 호출(사용)할 수 있다.
	//평균을 객체생성과 상관없이 아무때나 구하고 싶다.!!
	//객체생성과 상관없이 기능을 정의하고 싶으면,static
	public static int getAvg() {
		//static메서드안에 들어가는 전역변수는
		//객체생성하지 않아도 접근가능해야 하므로
		//static변수만 가능!!!
		return count/3;
	}
	@Override
	public String toString() {
		return "Day3 [study=" + study + ", clock=" + clock + ", place=" + place + "]";
	}
	
	
}
