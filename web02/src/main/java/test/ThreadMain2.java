package test;

public class ThreadMain2 {

	public static void main(String[] args) {
		//스레드 객체 3개 만들기
		
		StarThread star = new StarThread();
		GolbangThread gol = new GolbangThread();
		DodateThread dodate = new DodateThread();
		//cpu한테 실행할 대기줄에 넣어주세요.
		star.start();
		gol.start();
		dodate.start();
	}

}
