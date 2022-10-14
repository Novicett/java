package day01;

import java.util.Iterator;

public class ArrayEx01 {

	public static void main(String[] args) {
		int a[] = new int[10];
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		int b[][] = { { 100, 95, 90 }, { 85, 80, 75 } };
		int sum = 0;
		int sum2 = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 0) {
					sum = sum + b[i][j];
				} else if (i == 1) {
					sum2 = sum2 + b[i][j];
				}
			}
		}
		System.out.println(sum);
		System.out.println(sum2);

		String[][][] c = new String[2][3][2];

		c[0][0][0] = "a";
		c[0][0][1] = "b";
		c[0][1][0] = "c";
		c[0][1][1] = "d";
		c[0][2][0] = "e";
		c[0][2][1] = "f";
		c[1][0][0] = "g";
		c[1][0][1] = "h";
		c[1][1][0] = "i";
		c[1][1][1] = "j";
		c[1][2][0] = "k";
		c[1][2][1] = "l";
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				for (int j2 = 0; j2 < c[i][j].length; j2++) {
					System.out.print(c[i][j][j2] + " ");

				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
