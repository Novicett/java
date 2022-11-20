package practice01;

import javax.swing.JOptionPane;

public class UI {

	public static void main(String[] args) throws Exception {
		//DAO만들기복습 a = new DAO만들기복습();
		//DVO만들기복습 bag = new DVO만들기복습();
		//String id=JOptionPane.showInputDialog("id");
		//String content=JOptionPane.showInputDialog("content");
	
//		int id2=Integer.parseInt(id);
//		bag.setId(id2);
//		bag.setContent(content);
//		
//		a.insert(bag);
		
		String id=JOptionPane.showInputDialog("id");
		SelectDAO만들기 a = new SelectDAO만들기();
		int id2=Integer.parseInt(id);
		DVO만들기복습 bag=a.one(id2);
		System.out.println("검색결과"+bag);
	}

}
