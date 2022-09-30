package practice2;

import javax.swing.JOptionPane;

public class Ex01 {

	public static void main(String[] args) {
		String pw = "p";
		String pw2 = JOptionPane.showInputDialog("암호 입력");

		if (pw.equals(pw2)) {
			System.out.println("PASS!");
		} else {
			System.out.println("재입력!");
		}
	}

}
