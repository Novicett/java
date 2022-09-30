package variable;
//부품의 위치를 알려주는 부분.!!
//import가 자동으로 생성되게 하려면, jop +ctrl+ space
import javax.swing.JOptionPane;

public class Mypart2 {

	public static void main(String[] args) {
		//자주 쓰는 기능을 가진 부품을 대문자로 바로 쓸 수 있도록 준비되어있음
		//System, JOptionPane, 숫자로 변환해주는 부품들(Integer)
		// 취미, 이름 입력 ==> 출력
		String play=JOptionPane.showInputDialog("당신의 취미는?");
		String name=JOptionPane.showInputDialog("당신의 이름은?");
		//prompt(), 입력용
		String age=JOptionPane.showInputDialog("당신의 나이를 입력하세요.");
		
		//자주 안쓰는 기능을 가진 부품은 new를 가지고 새로 만들어 쓴다.
		// JFrame, Date, ....
		//alert(), null: 없다!!
		JOptionPane.showMessageDialog(null, "나의 나이는 :"+age);
		JOptionPane.showMessageDialog(null, "나의 이름은 :"+name);
		JOptionPane.showMessageDialog(null, "나의 취미는 :"+play);
		
	}

}
