package Controlling;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test5 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// 1. jframe 부품을 새로 만들어주자.
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(0, 255, 64));

		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JTextArea a1 = new JTextArea();
		a1.setFont(new Font("Monospaced", Font.BOLD, 15));
		a1.setBackground(new Color(255, 255, 0));
		a1.setBounds(246, 57, 165, 41);
		f.getContentPane().add(a1);
		
		JTextArea a2 = new JTextArea();
		a2.setFont(new Font("Monospaced", Font.BOLD, 15));
		a2.setBackground(new Color(255, 128, 64));
		a2.setBounds(246, 178, 165, 41);
		f.getContentPane().add(a2);
		
		JTextArea a4 = new JTextArea();
		a4.setFont(new Font("Monospaced", Font.BOLD, 15));
		a4.setBackground(new Color(0, 255, 255));
		a4.setBounds(246, 340, 165, 29);
		f.getContentPane().add(a4);
		
		JTextArea a3 = new JTextArea();
		a3.setFont(new Font("Monospaced", Font.BOLD, 15));
		a3.setBackground(new Color(0, 255, 255));
		a3.setBounds(246, 294, 165, 29);
		f.getContentPane().add(a3);
		
		JButton t1 = new JButton("어디로 갈까?");
		t1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//버튼 click시 실행될 함수
				String t1 = a1.getText();
				if(t1.equals("아메리카노") || t1.equals("아이스 아메리카노")|| t1.equals("홍차")) {
					JOptionPane.showMessageDialog(f, "카페로 가세요.");
				}else {
					JOptionPane.showMessageDialog(f, "물이나 마셔요.");
				}
				a1.setText("");
				
			}
		});
		t1.setFont(new Font("Dialog", Font.BOLD, 15));
		t1.setBackground(new Color(192, 192, 192));
		t1.setBounds(42, 112, 369, 41);
		f.getContentPane().add(t1);
		
		JButton t2 = new JButton("나의 내년 나이는?");
		t2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t2 = a2.getText();
				int age = Integer.parseInt(t2);
				JOptionPane.showMessageDialog(f, (age + 1) + "살");
				a2.setText("");
			}
		});
		t2.setFont(new Font("Dialog", Font.BOLD, 15));
		t2.setBackground(Color.LIGHT_GRAY);
		t2.setBounds(42, 229, 369, 41);
		f.getContentPane().add(t2);
		
		JButton t3 = new JButton("두 과목의 평균은?");
		t3.setFont(new Font("Dialog", Font.BOLD, 15));
		t3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t3 = a3.getText();
				String t4 = a4.getText();
				int g1 = Integer.parseInt(t3);
				int g2 = Integer.parseInt(t4);
				
				Double avg = (g1 + g2) / 2.0;
				JOptionPane.showMessageDialog(f, (avg) + "점");
				a3.setText("");
			}
		});
		t3.setBackground(Color.LIGHT_GRAY);
		t3.setBounds(42, 390, 369, 41);
		f.getContentPane().add(t3);
		
		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("한컴 고딕", Font.PLAIN, 20));
		lblNewLabel.setBounds(25, 44, 183, 54);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("당신의 나이는?");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("한컴 고딕", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(25, 165, 183, 54);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("국어 점수");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("한컴 고딕", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(42, 280, 183, 54);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("수학 점수");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("한컴 고딕", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(42, 326, 183, 54);
		f.getContentPane().add(lblNewLabel_3);
		
		f.setVisible(true);
	}

}
