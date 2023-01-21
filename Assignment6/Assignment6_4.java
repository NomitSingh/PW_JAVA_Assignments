package com.assignment;

import java.util.Scanner;

public class Assignment6_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal number: ");
		int m = sc.nextInt();
		System.out.println("Enter the binary number: ");
		int n = sc.nextInt();
		int a = n;
		int decimal = 0;
		int i=1;
		while(n!=0) {
			int rem = n%2;
			decimal = decimal + rem * i;
			i = i*2;
			n/=10;
		}
		System.out.println("Product is : " + m*decimal);
	}
}
