package classmake;

public class Bank {
	public String name;
	public String bank;
	public int money;
	
	public void input() {
		System.out.println(name+"이 "+money+"원을 입금하다.");
	}
	public void output() {
		System.out.println(name+"이 "+bank+"에서 출금하다.");
	}
}
