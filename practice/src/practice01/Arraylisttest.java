package practice01;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Arraylisttest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(); 
		//표준 배열보다는 느리지만 배열에서 많은 조작이 필요한 경우
		//용량을 초과하면 자동으로 부족한 크기만큼 용량이 늘어남
		for (int i = 0; i < 3; i++) {
			String data = JOptionPane.showInputDialog("하고싶은말");
			list.add(data);
		}
		System.out.println(list.size());
	}

}
