package javabasic;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Practice1002 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {
		JFrame f = new JFrame("단순 계산기");
		f.setSize(515, 521);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\backend\\java_study\\java_workspace\\java0405\\001.png"));
		lblNewLabel.setBounds(90, 0, 340, 189);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자 1");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(31, 215, 89, 69);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("숫자 2");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(31, 294, 89, 69);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t1 = new JTextField();
		t1.setBounds(152, 232, 149, 40);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(152, 311, 149, 40);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(152, 390, 149, 40);
		f.getContentPane().add(t3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("결과");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(31, 373, 89, 69);
		f.getContentPane().add(lblNewLabel_1_1_1);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=t1.getText();
				String b=t2.getText();
				int t11=Integer.parseInt(a);
				int t22=Integer.parseInt(b);
				int sum=t11+t22;
				t3.setText(""+sum);
			}
		});
		btnNewButton.setBounds(350, 231, 97, 30);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=t1.getText();
				String b=t2.getText();
				int t11=Integer.parseInt(a);
				int t22=Integer.parseInt(b);
				int sum=t11-t22;
				t3.setText(""+sum);
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1.setBounds(350, 271, 97, 30);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_2 = new JButton("*");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=t1.getText();
				String b=t2.getText();
				int t11=Integer.parseInt(a);
				int t22=Integer.parseInt(b);
				int sum=t11*t22;
				t3.setText(""+sum);
			}
		});
		btnNewButton_1_2.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1_2.setBounds(350, 311, 97, 30);
		f.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("/");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=t1.getText();
				String b=t2.getText();
				int t11=Integer.parseInt(a);
				int t22=Integer.parseInt(b);
				int sum=t11/t22;
				t3.setText(""+sum);
			}
		});
		btnNewButton_1_2_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1_2_1.setBounds(350, 350, 97, 30);
		f.getContentPane().add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_2_1_1 = new JButton("초기화");
		btnNewButton_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
				t3.setText("");
			}
		});
		btnNewButton_1_2_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1_2_1_1.setBounds(350, 390, 97, 30);
		f.getContentPane().add(btnNewButton_1_2_1_1);
		f.setVisible(true);
	}
}
