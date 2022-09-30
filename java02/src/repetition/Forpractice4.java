package repetition;

public class Forpractice4 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 33; i < 223; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		System.out.println("----------");

		int sum2 = 0;
		for (int j = 55; j < 4500; j = j + 2) {
			sum2 = sum2 + j;
		}
		System.out.println(sum2);
		System.out.println("----------");

		int sum3 = 0;
		for (int z = 0; z < 6001; z = z + 5) {
			sum3 = sum3 + z;
		}
		System.out.println(sum3);
		System.out.println("----------");

		int sum4 = 0;
		for (int k = 1; k < 1001; k = k + 3) {
			if (k % 5 != 0) {
				sum4 = sum4 + k;
				if (sum4 > 100) {
					break;
				} else {
					continue;
				}
			} else {
				continue;
			}
		}
		System.out.println(sum4);
	}

}
