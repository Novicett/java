package 생성자;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class China {
	static int count; //int count =0;와 동일, 전역변수는 자동 초기화
	static final int PRICE =5000; //상수는 final을 붙여서 변경 불가능으로 설정
	private static JTextField t1;

	static int count1=0;
	static int count2=0;
	static int count3=0;
	public static void main(String[] args) {
		JFrame f = new JFrame("음식점 주문 화면");
		f.getContentPane().setBackground(Color.RED);
		f.setSize(767, 490);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("개수 :");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(439, 38, 74, 43);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBackground(Color.YELLOW);
		t1.setFont(new Font("굴림", Font.BOLD, 20));
		t1.setBounds(525, 24, 214, 43);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel center = new JLabel("");
		//라벨에 이미지를 변경하고 싶으면, 이미지부품을 만들고, 라벨에 아이콘 셋팅
		ImageIcon img = new ImageIcon("다운로드.jpg");
		center.setIcon(img);
		center.setBounds(214, 104, 340, 248);
		f.getContentPane().add(center);
		
		JLabel result = new JLabel("결제금액");
		result.setFont(new Font("굴림", Font.BOLD, 20));
		result.setBounds(214, 364, 340, 63);
		f.getContentPane().add(result);
		
		JButton btnNewButton = new JButton("짜장면");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				count3++;
				t1.setText(count+"개");
				f.setTitle("짜장면"+count3+"개 "+"짬뽕"+count2+"개 "+"우동"+count1+"개 ");
				ImageIcon icon = new ImageIcon("다운로드 (1).jpg");
				center.setIcon(icon);
				result.setText("결제금액:"+count*PRICE);
			}
		});
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBounds(12, 10, 97, 71);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("짬뽕");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//주문량을 현재 카운트에 하나 플러스
				count++;
				count2++;
				t1.setText(count+"개");
				f.setTitle("짜장면"+count3+"개 "+"짬뽕"+count2+"개 "+"우동"+count1+"개 ");
				ImageIcon icon = new ImageIcon("다운로드 (2).jpg");
				center.setIcon(icon);
				result.setText("결제금액:"+count*PRICE);
			}
		});
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1.setBounds(126, 10, 97, 71);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("우동");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				count1++;
				t1.setText(count+"개");
				f.setTitle("짜장면"+count3+"개 "+"짬뽕"+count2+"개 "+"우동"+count1+"개 ");
				ImageIcon icon = new ImageIcon("다운로드.jpg");
				center.setIcon(icon);
				result.setText("결제금액:"+count*PRICE);
			}
		});
		btnNewButton_1_1.setBackground(Color.ORANGE);
		btnNewButton_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(235, 10, 97, 71);
		f.getContentPane().add(btnNewButton_1_1);
		
		
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}
}
