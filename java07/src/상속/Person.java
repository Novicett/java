package 상속;


//extends Object은 생략
//모든 클래스는 묵시적으로 object클래스를 상속받음
//모든 클래스는 8개의 메서드를 가지고 시작함
public class Person {
	String gender;
	String name;
	
	public void sleep() {
		System.out.println("잠자다");
	}
	public void eat() {
		System.out.println("먹다");
	}
	

	@Override
	public String toString() {
		return "Person [gender=" + gender + ", name=" + name + "]";
	}
	public static void main(String[] args) {
	}

}
