package 생성자;

public class Maskuse {

	public static void main(String[] args) {
		Mask m = new Mask();
		m.color="흰색";
		m.count=1;
		m.price=1000;

		//생성자 하나도 없는 경우,
		//자동으로 입력값없는 생성자를 만들어준다.
		//묵시적으로 생성자가 만들어진다.
		Mask m1 = new Mask("검정색",2500,2);
		System.out.println(m1.color);
		System.out.println(m1.count);
		System.out.println(m1.price);
		
		Mask m2 = new Mask("주황색");
		System.out.println(m2.color);
		
		System.out.println(m1);
	}

}
