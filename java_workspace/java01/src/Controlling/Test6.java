package Controlling;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test6 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(534,570);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(33, 51, 162, 49);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBackground(Color.YELLOW);
		t1.setBounds(223, 51, 259, 49);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("어디로 갈까?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1=t1.getText();
				if(n1.equals("아메리카노") ||n1.equals("아이스 아메리카노") ||n1.equals("홍차")) {
					JOptionPane.showMessageDialog(f,"카페로 갑시다.");
				}else {
					JOptionPane.showMessageDialog(f,"물이나 마시세요");
				}
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 15));
		btnNewButton.setBounds(33, 133, 449, 49);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("당신의 나이는");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(33, 192, 162, 49);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setBackground(Color.PINK);
		t2.setColumns(10);
		t2.setBounds(223, 192, 259, 49);
		f.getContentPane().add(t2);
		
		JButton btnNewButton_1 = new JButton("내년의 나이는");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n2=t2.getText();
				int n22=Integer.parseInt(n2);
				int n23=n22+1;
				JOptionPane.showMessageDialog(f,"내년에 "+ n23+" 입니다.");
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 15));
		btnNewButton_1.setBounds(33, 274, 449, 49);
		f.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("국어점수");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(33, 341, 162, 49);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t3 = new JTextField();
		t3.setBackground(Color.CYAN);
		t3.setColumns(10);
		t3.setBounds(223, 341, 259, 49);
		f.getContentPane().add(t3);
		
		JButton btnNewButton_1_1 = new JButton("두 과목의 점수는");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String korea=t3.getText();
				String math=t4.getText();
				Double korea2=Double.parseDouble(korea);
				Double math2=Double.parseDouble(math);
				Double div=(korea2+math2)/2.0;
				JOptionPane.showMessageDialog(f, "평균은"+div+"입니다.");
				
			}
		});
		btnNewButton_1_1.setFont(new Font("굴림", Font.BOLD, 15));
		btnNewButton_1_1.setBounds(33, 472, 449, 49);
		f.getContentPane().add(btnNewButton_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("수학점수");
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(33, 413, 162, 49);
		f.getContentPane().add(lblNewLabel_1_1_1);
		
		t4 = new JTextField();
		t4.setBackground(Color.CYAN);
		t4.setColumns(10);
		t4.setBounds(223, 413, 259, 49);
		f.getContentPane().add(t4);
	}

}
