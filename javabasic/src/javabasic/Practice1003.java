package javabasic;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Practice1003 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		
		f.setSize(400, 400);
		f.getContentPane().setLayout(flow);
		JButton b1 = new JButton("1번");
		f.add(b1);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(f, "당첨입니다.");
				
			}
		});
		for (int i = 2; i <= 100; i++) {
			JButton b = new JButton(i + "번");
			f.add(b);
			b.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(f, "꽝입니다.");
				}
			});
		}

		f.setVisible(true);
	}

}
