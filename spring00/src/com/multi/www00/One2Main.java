package com.multi.www00;

public class One2Main {

	public static void main(String[] args) {
		One2 s1=One2.getInstance();
		System.out.println(s1);
		System.out.println(One2.count);
		
		One2 s2=One2.getInstance();
		System.out.println(s2);
		System.out.println(One2.count);
	}

}
