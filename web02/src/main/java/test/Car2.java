package test;

public class Car2 {
	public static Car2 car2;

	// 외부에서 Car2객체를 생성 못하게 막아버리자
	private Car2() {

	}

	public static Car2 getInstance() {
		// 객체가 이미 만들어졌는지 확인해보고
		// null이면 하나 만들자.
		// null이 아니면 만들어진 것 리턴하자.

		if (car2 == null) {
			car2 = new Car2();
		}
		return car2;
	}

}
