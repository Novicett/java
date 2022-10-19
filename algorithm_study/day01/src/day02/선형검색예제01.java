package day02;

public class 선형검색예제01 {

	public static void main(String[] args) {
		int[]a= {6,4,3,2,1,2,8};
		int key=5;
		boolean flag=false;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==key) {
				flag=true;
				System.out.println("찾았다.");
				break;
			}
		}
		if (flag==false) {
			System.out.println("못찾았다.");
		}

	}

}
