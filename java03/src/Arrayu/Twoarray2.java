package Arrayu;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Twoarray2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		String subject[] = { "컴퓨터", "영어", "수학", "체육" };
		String score[][] = { { "100", "88", "99", "77" }, { "60", "87", "79", "78" }, { "90", "83", "89", "79" },
				{ "100", "88", "99", "77" }, { "60", "87", "79", "78" }, { "90", "83", "89", "79" },
				{ "100", "88", "99", "77" }, { "60", "87", "79", "78" }, { "90", "83", "89", "79" },
				{ "100", "88", "99", "77" }, { "60", "87", "79", "78" }, { "90", "83", "89", "79" },
				{ "100", "88", "99", "77" }, { "60", "87", "79", "78" }, { "90", "83", "89", "79" },
				{ "100", "88", "99", "77" }, { "60", "87", "79", "78" }, { "90", "83", "89", "79" } };
		
		JTable t = new JTable(score, subject);
		JScrollPane scroll = new JScrollPane(t);
		f.add(scroll);
		f.setVisible(true);
	}

}
