package 스레드;

public class Threaduse {

	public static void main(String[] args) {
		//초, 1000밀리초!!
		Conterthread c = new Conterthread();
		Timethread t = new Timethread();
		Arraythread a = new Arraythread();
		
		//cpu에 동시에 처리되도록 등록!!
		c.start();
		t.start();
		a.start();
	}

}
