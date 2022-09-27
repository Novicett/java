package Controlling;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test3 {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;

	public static void main(String[] args) {
		//jframe, 크기정하고, 보여라
		
		JFrame f =new JFrame();
		f.getContentPane().setBackground(new Color(128, 255, 0));
		f.getContentPane().setForeground(new Color(255, 255, 255));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("   이름");
		lblNewLabel.setBounds(12, 57, 67, 34);
		f.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setForeground(new Color(255, 128, 0));
		textField.setBounds(106, 56, 301, 34);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(106, 106, 301, 34);
		f.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("전화번호");
		lblNewLabel_1.setBounds(12, 105, 67, 34);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("주소");
		lblNewLabel_1_1.setBounds(12, 158, 67, 34);
		f.getContentPane().add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(106, 158, 301, 34);
		f.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(60, 278, 97, 48);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.setBounds(286, 278, 97, 48);
		f.getContentPane().add(btnNewButton_1);
		f.setVisible(true);
	}
}
