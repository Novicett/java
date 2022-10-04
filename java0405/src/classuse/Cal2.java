package classuse;

import classmake.Cal;

public class Cal2 {

	public static void main(String[] args) {
		// 자바는 "입력값이 다르면", 메서드 이름 동밀해도 된다.!!
		Cal c = new Cal();
		int result = c.add(200, 100);
		double result2 = c.add(100, 22.2);
		double result3 = c.add(11.1, 22.2);
		String result4 = c.add("ok", 100);
		int result5=c.multi(3000, 4);
		//메서드를 호출하고, 처리값을 main이 받아와서
		//아래코드 받아온 값을 이용해야 하는 경우,return  해야함.
		System.out.println("더한 값1은 "+result);
		System.out.println("더한 값2은 "+result2);
		System.out.println("더한 값3은 "+result3);
		System.out.println("더한 값4은 "+result4);
		System.out.println("더한 값5은 "+result5);
		c.div(result5, 4);
		
		//용어정리
		// 기본형 데이터 4가지  (논리형-boolean) (문자형-char) (정수형-byte,short,int,long) (실수형-float,double)
		// 참조형 변수란? (기본형을 제외한 나머지(String, System 등) 객체의 주소를 저장
		// 클래스와 객체(object)을 비교, 예를 들어도 됨. -클래스는 객체를 만들기 위한 설계도 해당 설계도를 통해 만들어진 무언가를 객체 또 다른 표현으로 인스턴스라 한다.
		// 객체지향방법은 어떤 방법? 일의 처리 과정을 객체 중심으로 분석하고 객체가 갖고 있는 처리 과정을 정의하는 방법.
		// 필요한 부품(객체)를 얻는 방법 3가지 - jdk ,mvn, 직접 만들기
		// 클래스의 구성요소 - 멤버변수, 멤버메서드
		// 멤버변수와 멤버메서드 - 멤버변수는 클래스의 속성 멤버메서드는 클래스의 동작
		// car클래스의 멤버변수가 int size, speed, Car c1=new Car(); 했을 때 변수는 몇 개 만들어지나? 3개
		// 자바의 메모리 구조 3영역 - 원본영역, 스택영역, 힙영역
		// 자바에서 메서드 이름 동일하게 해도 될까? 이 용어는? 메서드 오버로딩
		// 메서드를 만들 때 고려사항 2가지 -입력값(파라메터),반환값
		// void는 무슨 뜻? - 반환 값이 없는 텅빈 
		// 메서드 이름이 동일한 경우 무엇을 가지고 호출할 때 메서드를 구분해줄까? -타입 개수 순서
	}

}
