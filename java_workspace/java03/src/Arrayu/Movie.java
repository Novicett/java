package Arrayu;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Movie {
	// 전체영역에서 특정한 변수를 사용하려면
	// 클래스 아래에 선언해야한다.
	static int start = 2; // 전역변수

	public static void main(String[] args) {
		// ppt 104
		// 영화제목
		String title[] = { "삼진그룹영어토익반", "담보", "위플래시", "미스터트롯", "소리도없이" };
		// 포스터파일(파일이름)
		String img[] = { "common.jpg", "common (1).jpg", "common (2).jpg", "common (3).jpg", "common (4).jpg" };
		// 평점
		double score[] = { 99.9, 88.9, 77.9, 66.9, 55.9 };
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(372, 399);

		JLabel top = new JLabel("\uC9F1\uAD6C");
		top.setBackground(Color.YELLOW);
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(top, BorderLayout.NORTH);

		JLabel center = new JLabel("");
		ImageIcon icon = new ImageIcon(img[2]);
		center.setIcon(icon);
		f.getContentPane().add(center, BorderLayout.CENTER);

		JLabel under = new JLabel("77.9");
		under.setBackground(Color.YELLOW);
		under.setHorizontalAlignment(SwingConstants.CENTER);
		under.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(under, BorderLayout.SOUTH);

		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (start > 0) {
					// <<버튼을 클릭했을 때 처리하고 싶은 내용이 있으면,
					// actionPerformed()함수안에 넣어주세요.
					// 제목이 표시된 라벨에 제목을 변경해야함.
					start = start - 1; // 1 = 2 -1
					top.setText(title[start]); // title[1]
					under.setText(score[start] + "점");

					// 변경된 이미지 부품 다시 만들어야함.
					// 가운데 라벨에 벽녕된 이미지 부품을 넣으세요.
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				} else {
					JOptionPane.showMessageDialog(f, "여기가 왼쪽 끝입니다.");
				}
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 50));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);

		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (start < 4) {
					start++;
					top.setText(title[start]);
					under.setText(score[start] + "점");
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				}
				else {
					JOptionPane.showMessageDialog(f, "여기가 오른쪽 끝입니다.");
				}
			}
		});
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 50));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		f.setVisible(true);

	}
}