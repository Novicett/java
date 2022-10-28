package 크롤링;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Jocig {
	private static JTextField textField;
	//버튼을 누를때마다 textArea부분에 결과를 넣어주려면
	//아무곳에서나 접근이 가능해야함.
	//전역변수로 선언해주어야함.
	static JTextArea t1;
	public static void main(String[] args) {
		
		JFrame f = new JFrame("나의 주식 크롤링");
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(500,700);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CODE ");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(168, 190, 146, 50);
		f.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setForeground(Color.RED);
		textField.setFont(new Font("굴림", Font.BOLD, 15));
		textField.setBounds(158, 245, 170, 38);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
	    t1 = new JTextArea();
		t1.setForeground(Color.BLACK);
		t1.setFont(new Font("Monospaced", Font.BOLD, 25));
		t1.setBounds(12, 353, 460, 269);
		f.getContentPane().add(t1);
		
		JButton btnNewButton = new JButton("삼성전자");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code를 주면서, 크롤링해달라고하자
				//크롤링연습6의 naver(code)호출!!
				Cpractice6 a = new Cpractice6();
				String code=a.naver("005930");
				t1.setText(code);
			}
		});
		btnNewButton.setBackground(new Color(128, 255, 128));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBounds(80, 10, 328, 50);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("멀티캠퍼스");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cpractice6 a = new Cpractice6();
				String code=a.naver("067280");
				t1.setText(code);
			
			}
		});
		btnNewButton_1.setBackground(new Color(128, 255, 128));
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1.setBounds(80, 70, 328, 50);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("카카오뱅크");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cpractice6 a = new Cpractice6();
				String code=a.naver("323410");
				t1.setText(code);
			}
		});
		btnNewButton_1_1.setBackground(new Color(128, 255, 128));
		btnNewButton_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(80, 130, 328, 50);
		f.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("크롤링 시작");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			      //입력한 code를 가지고와라!!
				//textField에 입력한거!!!
				String code= textField.getText();//035420
				Cpractice6 a = new Cpractice6();
				String result = a.naver(code);
				t1.setText(result);
				
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 15));
		btnNewButton_2.setBounds(168, 293, 146, 50);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);
	}
}
