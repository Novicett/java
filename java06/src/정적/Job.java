package 정적;

public class Job {
	String name;
	int age;
	String g;
	static int count;
	static double count2;
	
	public Job(String name,int age, String g) {
		this.name=name;
		this.age=age;
		this.g=g;
		count++;
		count2+=age;
	}
	
	public static double avg(){
		return count2/3.0;
	}

	@Override
	public String toString() {
		return "Job [name=" + name + ", age=" + age + ", g=" + g + "]";
	}
	
}
