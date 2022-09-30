package Arrayu;

import java.util.Iterator;
import java.util.Random;

public class Toeiccc {

	public static void main(String[] args) {
		int answer[]=new int[990];
		int myanswer[]= new int[990];
		Random r = new Random();
		
		for (int i = 0; i < answer.length; i++) {
			answer[i]=r.nextInt(4)+1;
			myanswer[i]=r.nextInt(4)+1;
		}
		System.out.println("번호:\t답안\t내답");
		System.out.println("-----------------");
		for (int i = 0; i < myanswer.length; i++) {
			System.out.println(i+1+":\t "+answer[i] +"\t"+myanswer[i]);
		}
		
		//채점해보자.
		int count=0;
		for (int i = 0; i < myanswer.length; i++) {
			if (answer[i]==myanswer[i]) {
				count++;
			}
		}
		System.out.println(count);
	}

}
