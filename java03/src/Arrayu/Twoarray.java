package Arrayu;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Twoarray {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
	
		String header[] = { "a", "b", "c" };
		String contents[][] = { { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" } };
		contents[0][0]="999";
		JTable table = new JTable(contents,header);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		f.setVisible(true);
		
		//contents.length: 1차원 배열의 개수(11개)
		for (int i = 0; i < contents.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(contents[i][j]+" ");
			}
			System.out.println();
		}
	}

}
