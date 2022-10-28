package 형변환;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Boychange4 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.black);
		f.setSize(2000, 2000);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JButton b1 = new JButton("빨강신호");
		JButton b2 = new JButton("노랑신호");
		JButton b3 = new JButton("파랑신호");
		b1.setFont(new Font("굴림", Font.BOLD, 30));
		b1.setBackground(Color.red);
		b2.setFont(new Font("굴림", Font.BOLD, 30));
		b2.setBackground(Color.yellow);
		b3.setFont(new Font("굴림", Font.BOLD, 30));
		b3.setBackground(Color.green);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		 

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("r.jpg");
				img.setIcon(icon);
				f.add(img);
				f.setVisible(true);
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("y.jpg");
				img.setIcon(icon);
				f.add(img);
				f.setVisible(true);
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("g.jpg");
				img.setIcon(icon);
				f.add(img);
				f.setVisible(true);
			}
		});
		f.setVisible(true);
	}

}
