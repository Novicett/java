package Arrayu;

import javax.swing.JOptionPane;

public class Arraytest3 {

	public static void main(String[] args) {
		String tour[] = new String[3];
		String tour2[] = new String[3];
		
		for (int i = 0; i < tour2.length; i++) {
			tour[i] = JOptionPane.showInputDialog("작년에 가고 싶었던 곳");
			tour2[i] = JOptionPane.showInputDialog("올해 가고 싶었던 곳");
		}
		for (int i = 0; i < tour2.length; i++) {
			System.out.println(tour[i] + " " + tour2[i]);
		}
		int count = 0;
		for (int i = 0; i < tour2.length; i++) {
			if (tour[i].equals(tour2[i])) {
				count++;
			}
		}
		JOptionPane.showMessageDialog(null, count);

	}

}
