package test;

public class ThreadMain {

	public static void main(String[] args) {
		//스레드 객체 3개 만들기
		
		CounterThread counter = new CounterThread();
		imgThread img  = new imgThread();
		TimerThread timer = new TimerThread();
		
		
		//cpu한테 실행할 대기줄에 넣어주세요.
		counter.start();
		img.start();
		timer.start();
	}

}
