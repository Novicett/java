package 정적;

public class Day4 {

	public static void main(String[] args) {
		Day3 d = new Day3("자바공부", 10, "강남");
		System.out.println(Day3.count);
		
		Day3 d1 = new Day3("여행", 15, "강원도");
		System.out.println(Day3.count);
		Day3 d2 = new Day3("운동", 11, "피트니스");
		System.out.println(Day3.count);
		System.out.println(Day3.getAvg());
	}

}
