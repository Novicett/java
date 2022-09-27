package practice;

import javax.swing.JOptionPane;

public class Exam03 {

	public static void main(String[] args) {
		String tel=JOptionPane.showInputDialog("통신사 입력");
		String phone=JOptionPane.showInputDialog("전화번호 입력");
		String name=JOptionPane.showInputDialog("가입자이름 입력");
		String con=name+"님은 "+tel+"에 "+phone;
		JOptionPane.showMessageDialog(null,"다이얼로그로 "+con+" 로 가입되셨습니다.");
	}

}
