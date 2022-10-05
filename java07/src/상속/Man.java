package 상속;

public class Man extends Person {
		//멤버변수 몇개??
		//2개
		int size;
		//멤버메서드 몇개??
		//10개
		public void run() {
			System.out.println("빨리 달리다.");
		}
		@Override
		public String toString() {
			return "Man [size=" + size + ", gender=" + gender + ", name=" + name + "]";
		}
	

}
