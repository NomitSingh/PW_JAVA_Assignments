package com.assignment;

import java.util.Scanner;

public class Assignment4_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int x = sc.nextInt();
		if(x>=0) { System.out.println("Entered number is positive " );
		 System.out.println("The number is " + x);
		}
		else  System.out.println("Entered number is negative " );
	}
}
