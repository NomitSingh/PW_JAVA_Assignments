package com.assignment;

import java.util.Scanner;

public class Assignment6_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal number: ");
		int n = sc.nextInt();
		int binary_number = 0;
		int i = 1;
		while(n!=0) {
			int rem = n%2;
			binary_number = binary_number + rem*i;
			i= i*10;
			n/=2;
		}
		System.out.println(binary_number);
	}
}
