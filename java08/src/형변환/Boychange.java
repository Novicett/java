package 형변환;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Boychange {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300,300);
		f.setLayout(new FlowLayout());
		JButton b = new JButton("나는 버튼");
		JTextField a = new JTextField("하이");
		JLabel j = new JLabel("뿌뿌");
		f.add(b); //component <-- button
		f.add(a);//component <-- jtextfield
		f.add(j);//component <-- jlabel
		f.setVisible(true);
	}

}
