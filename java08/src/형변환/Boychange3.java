package 형변환;

import java.util.ArrayList;

public class Boychange3 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(1000);
		//object<-자동형변환 integer <- 오토박싱 int
		list.add(189.1);
		list.add(false);
		list.add("남");
		int money=(int)list.get(0);
		//int <-오토언박싱- Integer <-강제형변환 -Object
		double height=(double)list.get(1);
		boolean food=(boolean)list.get(2);
		String gander=(String)list.get(3);
		System.out.println(list);
		//tostring 재정의
		System.out.println("내 돈은:"+money+2000);
		System.out.println("올해의 키는:"+height+10);
		if (food==true) {
			System.out.println("배불러요");
		} else {
			System.out.println("배고파요");
		}
		if (gander.equals("남")) {
			System.out.println("주민번호는 1,3이예요");
		} else {
			System.out.println("주민번호는 2,4예요");
		}
	}

}
