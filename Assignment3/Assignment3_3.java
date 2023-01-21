package com.assignment;

import java.util.Scanner;

public class Assignment3_3 {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any digit: ");
		int n = sc.nextInt();
		while(n>0) {
			sum = sum + n%10;
			n=n/10;
		}
		System.out.println("The sum of given digits are: " + sum);
	}
}
