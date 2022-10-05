package javabasic;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Practice1004 {
	private static JTextField t1;
	static int count=0;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400,400);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 40));
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setBounds(0, 105, 384, 140);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText(""+count++);
				System.out.println(count);
			}
		});
		btnNewButton.setBounds(135, 10, 120, 74);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("마이너스");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText(""+count--);
				System.out.println(count);
			}
		});
		btnNewButton_1.setBounds(135, 277, 120, 74);
		f.getContentPane().add(btnNewButton_1);
		
		
		
		f.setVisible(true);
	}
}
