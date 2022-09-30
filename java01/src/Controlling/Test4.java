package Controlling;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test4 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("숫자 1");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setBounds(36, 99, 122, 76);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자 2");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1.setBounds(36, 220, 122, 76);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBackground(new Color(255, 255, 0));
		t1.setBounds(194, 99, 250, 76);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(new Color(255, 255, 0));
		t2.setColumns(10);
		t2.setBounds(194, 220, 250, 76);
		f.getContentPane().add(t2);
		
		JButton plus = new JButton("더하기");
		plus.addActionListener(new ActionListener() {
			//버튼을 클릭했을 때 actionPerformed()함수가 사용하도록 규칙이 설정되어있음.
			public void actionPerformed(ActionEvent e) {
				//plus버튼을 눌렀을 때 처리하고 싶은 내용을 넣는다.
				JOptionPane.showMessageDialog(f, "플러스 버튼을 누르셨군요.");
				//1.두수를 가지고 오세요.
				String n1=t1.getText(); 
				String n2=t2.getText();
				//2.숫자로 변경해서 정수변수에 넣어주세요
				int n11=Integer.parseInt(n1);
				int n22=Integer.parseInt(n2);
				//3.결과출력
				//JOptionPane.showMessageDialog(f, n11+n22);
				f.setTitle("더한 결과는"+(n11+n22));
				t1.setText("");
				t2.setText("");
				t1.setBackground(Color.blue);
				t1.setForeground(Color.red);
			}
		});
		plus.setBackground(new Color(0, 255, 255));
		plus.setFont(new Font("굴림", Font.BOLD, 20));
		plus.setBounds(57, 345, 138, 88);
		f.getContentPane().add(plus);
		
		JButton min = new JButton("빼기");
		min.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "빼기 버튼을 누르셨군요.");
				String a1=t1.getText();
				String a2=t2.getText();
				
				int a11=Integer.parseInt(a1);
				int a22=Integer.parseInt(a2);
				JOptionPane.showMessageDialog(f, a11-a22);
			}
		});
		min.setBackground(Color.CYAN);
		min.setFont(new Font("굴림", Font.BOLD, 20));
		min.setBounds(291, 345, 138, 88);
		f.getContentPane().add(min);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\backend\\java_study\\java_workspace\\java01\\cul.jpg"));
		btnNewButton_2.setBounds(0, 0, 484, 89);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);
	}

}
