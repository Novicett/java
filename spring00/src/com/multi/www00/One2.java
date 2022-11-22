package com.multi.www00;

public class One2 {
	static int count;
	static One2 object; //null
	
	//static메서드는 객체생성 되기전에 호출가능함.
	//세탁기 만들어지기 전에 세탁기가 만들어졌는데 안만들어졌는지 확인하는 메서드
	public static One2 getInstance(){
		if(object==null) {
			object= new One2();
		}
		return object;
	}
	//싱글톤으로 만들어서 사용할 클래스는 외부에서 만들어지 못하도록 생성자의
	//접근을 막아버리면 됨.
	private One2() { //private접근제어자는 클래스안에서만 접근 가능
		System.out.println("안녕 나도 생성자야");
		count++;
	}
	
	
}
