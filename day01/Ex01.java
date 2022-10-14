package day01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		double a=1,b=13,c=12;
		double x=(-b+(Math.sqrt((b*b)-4*a*c)))/(2*a);
		double x1=-b-Math.sqrt((b*b)-4*a*c)/(2*a);
		System.out.println(x);
		System.out.println(x1);
	}

}
