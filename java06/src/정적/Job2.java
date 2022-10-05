package 정적;

public class Job2 {

	public static void main(String[] args) {
		Job j = new Job("홍길동",25,"여");
		Job j1 = new Job("김길동",24,"남");
		Job j2 = new Job("송길동",26,"여");
		System.out.println("우리회사의 직원수는?"+Job.count);
		System.out.println(j);
		System.out.println(j1);
		System.out.println(j2);
		System.out.println("우리회사의 직원의 평균 나이는?"+Job.avg());
	}

}
