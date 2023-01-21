package com.assignment;

import java.util.Scanner;

public class Assignment4_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");
		int l = sc.nextInt();
		System.out.println("Enter the breadth: ");
		int b = sc.nextInt();
		if(l==b) {
			System.out.println("It is a square");
		} else {
			System.out.println("It is not square");
		}
	}
}
