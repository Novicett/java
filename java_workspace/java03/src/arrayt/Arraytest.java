package arrayt;

public class Arraytest {

	public static void main(String[] args) {
		//무더기에 저장될 데이터를 미리 알고 있는 경우
		int[] toeic = { 1, 1, 2, 3 };
		// int[]: int 데이터가 무더기로 저장된 위치(주소)
		// toeic : 주소가 저장됨.
		// {1,1,2,3} : 무더기영역에 저장된 정수 데이터들
		System.out.println(toeic);

		int[] mytoeic = { 1, 2, 4, 3 };
		
		//무더기에 저장될 데이터를 처음에 모르고 있다가 
		//나중에 넣을 수도 있음.
		int [] no=new int[1000];
		
		double[] a= {123.4,234.2,124.5};
		double[] b= new double[500];
		
		char gender[]= {'남','여','남'};
		String c[]=new String[333];
	}

}
