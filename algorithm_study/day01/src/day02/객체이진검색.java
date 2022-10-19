package day02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 객체이진검색 {

	public static void main(String[] args) {
		// 1. Student 클래스를 객체화하여서 배열에 담아 둔다.
		Student[] sArr = { new Student("강민하", 159, 0.4), new Student("이수연", 170, 0.5), new Student("황지인", 156, 0.3),
				new Student("김찬우", 158, 15), };
		Scanner sc = new Scanner(System.in);
		System.out.println("찾고 싶은 키를 입력해 주세요.");
		int key = sc.nextInt();
		int idx = Arrays.binarySearch(sArr, new Student("", key, 0.0), Student.HEIGHT_ORDER);
		if(idx ==9999) System.out.println(key+"찾는 키를 가진 사람이 없습니다.");
		else {
			System.out.println("그값은"+idx+"에 있습니다.");
			System.out.println("찾는 데이터는"+sArr[idx]+"입니다.");
		}
	}
}

class Student {
	String name;// 이름
	int height;// 키
	double vision;// 시력

	public Student(String name, int height, double vision) {
		this.name = name;
		this.height = height;
		this.vision = vision;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", height=" + height + ", vision=" + vision + "]";
	}

	public static final Comparator<Student> HEIGHT_ORDER = new HeightComparator();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getVision() {
		return vision;
	}

	public void setVision(double vision) {
		this.vision = vision;
	}
}

class HeightComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return (o1.height > o2.height) ? 1 : (o1.height == o2.height) ? 0 :(o1.height < o2.height) ?-1:9999 ;
	}

}