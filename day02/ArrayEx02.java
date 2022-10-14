package day02;

public class ArrayEx02 {

	public static void main(String[] args) {
		String[][] s = new String[5][2];
		s[0][0] = "0397134";
		s[0][1] = "김효진";
		s[1][0] = "0465345";
		s[1][1] = "이종협";
		s[2][0] = "0427214";
		s[2][1] = "서상춘";
		s[3][0] = "0487342";
		s[3][1] = "배영미";
		s[4][0] = "0512478";
		s[4][1] = "김예진";

		int[] s1 = new int[5];
		for (int i = 0; i < s1.length; i++) {
			s1[i] = Integer.parseInt(s[i][0]);
		}

		int[] s2 = new int[5];
		for (int i = 0; i < s1.length; i++) {
			int count=0;
			for (int j = 0; j < s1.length; j++) {
				if (s1[i]>s1[j]) {
					count++;
					s2[i]=count;
				}
			}
		}
		for(int k :s2) {
			System.out.print(k+ " ");
		}
		
		String so[][]= new String[5][2];
		for (int i = 0; i < so.length; i++) {
			for (int j = 0; j < so.length; j++) {
				so[s2[i]][0]=String.valueOf(s[i]);
			}
		}
	}

}
