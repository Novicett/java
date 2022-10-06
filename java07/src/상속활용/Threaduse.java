package 상속활용;

public class Threaduse {

	public static void main(String[] args) {
		Seethread name = new Seethread();
		Imagethread name1 = new Imagethread();
		Conterthread name2 = new Conterthread();
		
		name.start();
		name1.start();
		name2.start();
	}

}
