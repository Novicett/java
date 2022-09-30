package classuse;

//class의 위치를 지정함.
import classmake.Classmake0;
import classmake.Classmake1;

public class Myroom {

	public static void main(String[] args) {
		// 전화기 한대 넣어보세요
		Classmake0 p1 = new Classmake0();
		// p1은 참조형변수(주소)
		System.out.println(p1);
		p1.size = 11;
		p1.speaker = "바나나사";

		System.out.println(p1.size);
		System.out.println(p1.speaker);
		p1.call();
		p1.pic();

		// 전화기 1대추가
		// 전화기의 속성, 기능써보기
		Classmake0 p2 = new Classmake0();
		p2.size = 13;
		p2.speaker = "Apple사";
		System.out.println(p2.size);
		System.out.println(p2.speaker);
		p2.call();
		p2.pic();

		// 강아지 1마리 가져다 놓으시고,
		// 강아지의 속성, 동작시켜보세요.
		Classmake1 d1 = new Classmake1();
		d1.leg = 4;
		d1.month = 1;
		d1.color = "black";

		System.out.println("이 강아지의 다리는" + d1.leg + "개 입은" + d1.month + "개");
		d1.eat();
		d1.walk();
		System.out.println(d1.color);
	}

}
