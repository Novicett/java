package classuse;

//클래스만들기  패키지에 있는 벽돌틀
import classmake.Rock0;

public class Home {

	public static void main(String[] args) {
		Rock0 r = new Rock0(); //벽돌틀을 이용해서 벽돌을 하나 만드세요!
		r.x=50;
		r.y=50;
		
		r.bulid();
		//주소만 있으면 변수, 메서드에도 접근 가능
		//현재는 r은 주소가 들어있음.
		
		Rock0 r2= new Rock0();
		r2.x=150;
		r2.y=150;
		r2.bulid();
		
		System.out.println(r);
		System.out.println(r2);
		
		System.out.println(r.x);
		System.out.println(r.y);
	}

}
