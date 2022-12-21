package practice;

/** 
 *@author Lim chae yun*/
public class Test01 {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		int a=12;
		System.out.println(a>>>1);
		char c='f';
		String gender = c=='f'?"여자":"남자";
		System.out.println(gender);
		int e=5;
		
		byte k=(byte)e;
		System.out.println(k);
		int h=2;
		do {
			System.out.println("hi");
			h++;
		} while (h<5);
		int num=10;
		int sum1=0;
		int sum2=0;
		
		int q[][]= new int[5][];
		q[0]= new int[1];
	}

}
