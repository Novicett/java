package Operators;

import javax.swing.JOptionPane;

public class Naverwow {

	public static void main(String[] args) {
		// db에 저장되었다고 가정
		String id = "dlacodbs";
		String pw = "pass";
		// 로그인할 때 입력 id/pw
		String id2 = JOptionPane.showInputDialog("로그인 id");
		String pw2 = JOptionPane.showInputDialog("로그인 pw");
		// String은 기본형이 아니야 값을 비교할 때 연산자를 쓸 수가 없어
		if (id.equals(id2) && pw.equals(pw2)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

	}

}
