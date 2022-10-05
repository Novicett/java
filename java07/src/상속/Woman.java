package 상속;

public class Woman extends Person{
	int size;
	
	public void hair() {
		System.out.println("머리를 기르다.");
	}
	public void dance() {
		System.out.println("춤을 추다.");
	}
	@Override
	public String toString() {
		return "Woman [size=" + size + ", gender=" + gender + ", name=" + name + "]";
	}
	
}
