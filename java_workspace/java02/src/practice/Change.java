package practice;

public class Change {

	public static void main(String[] args) {
		int a=100;
		byte b=50;
		a=b;
		//타입변환(형변환)
		//큰공간 <-- 작은공간데이터(자동)
		int c=100;
		b=(byte)c;
		//작은공간 <-- 큰공간데이터(강제형변환)
		//작은공간에 들어갈 수 있는 범위어야함
		System.out.println(b);
	}

}
