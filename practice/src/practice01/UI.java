package practice01;

import javax.swing.JOptionPane;

public class UI {

	public static void main(String[] args) throws Exception {
		DAO만들기복습 a = new DAO만들기복습();
		String id=JOptionPane.showInputDialog("1");
		int id2=Integer.parseInt(id);
		a.insert(id2);
	}

}
