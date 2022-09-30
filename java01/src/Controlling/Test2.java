package Controlling;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test2 {
	private static JTextField textField;

	public static void main(String[] args) {
		//1. JFrame 부품을 새로 만들어주자
		JFrame f=new JFrame();
		
		//2. 새로 만든 부품의 크기를 결정
		f.setSize(500, 500);
		
		textField = new JTextField();
		f.getContentPane().add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		f.getContentPane().add(textArea, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\backend\\java_study\\java_workspace\\java01\\red.png"));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("New label");
		f.getContentPane().add(lblNewLabel, BorderLayout.WEST);
		
		
		// 3.부품 보여주세용
		f.setVisible(true);
		
	}

}
