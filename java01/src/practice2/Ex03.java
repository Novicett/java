package practice2;

import javax.swing.JOptionPane;

public class Ex03 {

	public static void main(String[] args) {
		String pw = "p";
		String pw2 = JOptionPane.showInputDialog("암호 입력");
		double fat=2.2;
		double todayfat=2.0;
		
		if (pw.equals(pw2)&&fat>todayfat) {
			System.out.println("오늘은 성공!");
		} else {
			System.out.println("내일 다시도전");
		}
	}

}
