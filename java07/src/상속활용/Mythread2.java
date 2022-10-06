package 상속활용;

public class Mythread2 extends Thread{
	@Override
	public void run() {
		String list[]= {"car01.png","car02.png","car03.png"};
		
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
