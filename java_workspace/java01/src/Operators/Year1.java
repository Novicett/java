package Operators;

import javax.swing.JOptionPane;

public class Year1 {

	public static void main(String[] args) {
		//입력
		String age=JOptionPane.showInputDialog("올해 나이 입력");
		int age2=Integer.parseInt(age);
		// 숫자로 변환해주세요
		int age3=age2+1;
		//처리
		//출력
		JOptionPane.showMessageDialog(null, "내년 나이는 "+age3);
	}

}
