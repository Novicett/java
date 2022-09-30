package repetition;

public class Forpractice3 {

	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i <= 10000; i++) {
			//1부터 1씩 증가하면서 10까지 처리
			//System.out.println(i);
			sum=sum+i;
		}
		System.out.println(sum);
		
		System.out.println("--------------");
		//3~11까지 더해보세요.
		int sum2=0;
		     // 초기값    조건식    증감식
		for (int j = 3; j < 12; j++) {
			sum2=sum2+j;
		}
		System.out.println(sum2);
	}

}
