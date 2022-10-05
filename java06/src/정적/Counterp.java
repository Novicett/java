package 정적;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Counterp {
	private static JTextField t1;
	static int count;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setForeground(Color.RED);
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setFont(new Font("굴림", Font.BOLD, 50));
		t1.setText("0");
		t1.setBounds(105, 112, 279, 253);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("증가");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				t1.setText(count+"");
			}
		});
		btnNewButton.setBounds(30, 10, 97, 45);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("0");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count=0;
				t1.setText(count+"");
			}
		});
		btnNewButton_1.setBounds(194, 10, 97, 45);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("감소");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count--;
				t1.setText(""+count);
			}
		});
		btnNewButton_1_1.setBounds(355, 10, 97, 45);
		f.getContentPane().add(btnNewButton_1_1);
		
		f.setVisible(true);
		
	}
}
