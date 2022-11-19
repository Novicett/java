package practice01;

import javax.swing.JOptionPane;

public class UI {

	public static void main(String[] args) throws Exception {
		DAO만들기복습 a = new DAO만들기복습();
		DVO만들기복습 bag = new DVO만들기복습();
		String id=JOptionPane.showInputDialog("id");
		String title=JOptionPane.showInputDialog("title");
		String content=JOptionPane.showInputDialog("content");
		String actor=JOptionPane.showInputDialog("actor");
		int id2=Integer.parseInt(id);
		bag.setId(id2);
		bag.setTitle(title);
		bag.setContent(content);
		bag.setActor(actor);
		a.insert(bag);
	}

}
