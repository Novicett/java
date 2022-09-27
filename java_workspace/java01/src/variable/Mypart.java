package variable;

import javax.swing.JFrame;

public class Mypart {
	// class만들 때, alt +v(main선택)
	// main + ctrl +space : main함수 수동으로 만들 때
	public static void main(String[] args) {
		System.out.print("hello");
		
		JFrame f = new JFrame ();
		f.setSize(300,300);
		f.setVisible(true);
		
		JFrame f2 = new JFrame ();
		f2.setSize(500,500);
		f2.setVisible(true);
	}
}
