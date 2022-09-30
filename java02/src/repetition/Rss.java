package repetition;

import java.util.Random;

import javax.swing.JOptionPane;

public class Rss {

	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(100); //0~99
		int count = 0; // int는 보통 0으로 초기화시켜줌
		int count2 = 0;
		while (true) {
			String data = JOptionPane.showInputDialog("생각한 숫자 입력");
			int data2 = Integer.parseInt(data);
			count = count + 1;// count++; (증감연산자, 1씩증가/감소)
			if (data2 == target) {
				System.out.println("정답입니다.!! 축하합니다.!!");
				System.out.println("정답은 : "+target);
				System.out.println("전체 시도횟수는 :" + count + " 틀린 횟수는 :" + count2);
				// 무한루프를 반드시 끝내는 처리를 해야함.
				// break; //while 종료
				System.exit(0); // 정답맞추기 게임 프로그램을 종료
			} else {
				System.out.println("정답아닙니다.!!");
				count2 = count2 + 1;
				// 입력한 값이 정답보다 큰지, 작은지를 알려주세요.
				if (data2 > target) {
					System.out.println("너무 커요.");
				} else {
					System.out.println("너무 작아요.");
				}
			}
		}
		// JOptionPane.showConfirmDialog(null, "다음에 또 방문해주세요");
	}

}
