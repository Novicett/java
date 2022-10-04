package classuse;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mymemo {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(523, 529);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\backend\\java_study\\java_workspace\\java04\\001.png"));
		lblNewLabel.setBounds(93, 10, 302, 143);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("아이디:");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 17));
		lblNewLabel_1.setBounds(93, 174, 92, 57);
		f.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("비밀번호:");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(93, 262, 92, 57);
		f.getContentPane().add(lblNewLabel_1_1);

		t1 = new JTextField();
		t1.setBounds(199, 174, 212, 57);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(197, 262, 212, 57);
		f.getContentPane().add(t2);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//t1,t2의 글자를 지워지는 것처럼 공백을 집어넣어라
				t1.setText("");
				t2.setText("");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\backend\\java_study\\java_workspace\\java04\\002.jpg"));
		btnNewButton_1.setBounds(273, 348, 138, 118);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText(); // textfield에 있는것들을 가져와라!!
				if (s1.equals("dlacodbs") && s2.equals("1234")) {
					Mymemo2 diary = new Mymemo2();
					diary.open();
				} else {
					JOptionPane.showMessageDialog(f, "로그인실패");
				}
				// id="dlacodbs" pw="1234"이면 일기쓰는 화면을 띄우고
				// 아니면, JOptionPane으로 "입력값이 달라서 로그인실패입니다."
				// 저 일기쓰기 화면창을 띄워라!!

			}
		});
		btnNewButton_1_1.setIcon(new ImageIcon("C:\\backend\\java_study\\java_workspace\\java04\\003.jpg"));
		btnNewButton_1_1.setBounds(89, 348, 138, 118);
		f.getContentPane().add(btnNewButton_1_1);

		f.setVisible(true);
	}
}
