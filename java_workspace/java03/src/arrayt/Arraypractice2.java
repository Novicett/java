package arrayt;

public class Arraypractice2 {

	public static void main(String[] args) {
		String tour[] = { "서울", "도쿄", "뉴욕", "오사카", "수리남" };
		char color[] = { 'r', 'g', 'b', 'y', 'b' };
		double height[] = { 111.1, 123.1, 158.2, 198.5, 187.3 };

		for (String s : tour) {
			System.out.print(s + " ");
		}
		System.out.println();
		for (int i = 0; i < color.length; i++) {
			System.out.print(color[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < height.length; i++) {
			System.out.print(height[i] + " ");
		}
	}

}
