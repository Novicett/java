package 상속활용;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mythread3 extends JFrame{
	JLabel car;
	JLabel price;
	public Mythread3() {
		 setSize(300, 300);
		  car=new JLabel("자동차");
		  price= new JLabel("가격");
		 
	 add(car,BorderLayout.WEST);
	 add(price,BorderLayout.EAST);
		 setVisible(true);
		 Mythread a = new Mythread();
		 a.start();
		 Mythread2 b = new Mythread2();
		 b.start();
	}
	public static void main(String[] args) {
		Mythread3 m = new Mythread3();
		 
	}
	public class Mythread2 extends Thread{
		@Override
		public void run() {
			String list[]= {"car01.png","car02.png","car03.png"};
			
			for (int i = 0; i < list.length; i++) {
				//System.out.println(list[i]);
				ImageIcon icon = new ImageIcon(list[i]);
				car.setIcon(icon);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public class Mythread extends Thread{
		String car[]= {"1000000","200000","3000000",};
		@Override
		public void run() {
			for (int i = 0; i < 3; i++) {
				//System.out.println("가격 :"+car[i]);
				price.setText("가격 >> "+car[i]);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}

}
