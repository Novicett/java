package 정적;

public class Day2 {

	public static void main(String[] args) {
		//변수는 선언된 위치를 포함한 괄호안에서만 사용 가능
		//d,d1,d2는 메서드 안에서만 쓸 수 있음
		//main안에서만 쓸 수 있는 지역변수
		//지역변수 <-----> 전역변수
		Day d = new Day("밥",1,"부산");
		System.out.println(d);
		System.out.println(Day.count); //static!!
		Day d1 = new Day("밀",2,"장산");
		System.out.println(d1);
		System.out.println(Day.count);
		Day d2 = new Day("옥수수",3,"무산");
		System.out.println(d2);
		System.out.println(Day.count);
	}

}
