package 상속활용;

public class Mythread extends Thread{
	String car[]= {"1000000","200000","3000000",};
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("가격 :"+car[i]);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
