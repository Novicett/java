package classuse;

import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class Mymemo2 {
	//맴버변수
	private static JTextField t1;
	private static JTextField t2;
	//맴버 메서드
	public void open() {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("오늘의 날짜");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(35, 21, 146, 47);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("오늘의 제목");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(35, 123, 146, 47);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("오늘의 내용");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(35, 242, 146, 47);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t1 = new JTextField();
		t1.setBackground(Color.GREEN);
		t1.setFont(new Font("굴림", Font.BOLD, 15));
		t1.setForeground(Color.BLUE);
		t1.setBounds(207, 21, 236, 47);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(Color.GREEN);
		t2.setFont(new Font("굴림", Font.BOLD, 15));
		t2.setForeground(Color.BLUE);
		t2.setColumns(10);
		t2.setBounds(207, 123, 236, 47);
		f.getContentPane().add(t2);
		
		JTextArea t3 = new JTextArea();
		t3.setBackground(Color.GREEN);
		t3.setFont(new Font("Monospaced", Font.BOLD, 15));
		t3.setForeground(Color.BLUE);
		t3.setBounds(207, 242, 236, 128);
		f.getContentPane().add(t3);
		
		JButton btnNewButton = new JButton("파일을 일기에 저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1=t1.getText();
				String s2=t2.getText();
				String s3=t3.getText();
				
				//자바프로그램 밖에 있는 자원들(네트워크, db프로그램, 파일, etc)을 연결할 때는
				//프로그램이 실행되지 못하는 위험한 상항으로 인식해서
				//반드시 위험한 상황이 발생하면 어떻게 처리할지를 명시해주어야한다.
				//try~catch
				try {
					//file.txt와 자바프로그램간 스트림(강물, 연결통로)를 만들어라!
					FileWriter file = new FileWriter(s1+".txt");
					//스트림을 통해서 데이터를 보내라
					file.write(s1 + "\n"); //\n이면 엔터를 넣어준다.
					file.write(s2 + "\n");
					file.write(s3 + "\n");
					//스트림이 닫힐 때 데이터를 다 보냈다고 인식함.
					file.close();
				} catch (Exception e1) {
					System.out.println("파일에 저장 중 에러발생.!!!");
				}
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 25));
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setBounds(35, 385, 408, 66);
		f.getContentPane().add(btnNewButton);
		
		
		
		
		
		f.setVisible(true);
	}
}
