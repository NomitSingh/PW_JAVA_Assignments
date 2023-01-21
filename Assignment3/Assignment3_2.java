package com.assignment;

import java.util.Scanner;

public class Assignment3_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Numbers before swapping are a="+ a +" and b=" + b );
		a = a+b;
		b=a-b;
		a=a-b;
		System.out.println("Numbers after swapping are a=" + a +" and b = "+b);
		
	}
}
