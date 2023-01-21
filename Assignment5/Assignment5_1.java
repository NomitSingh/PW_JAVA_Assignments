package com.assignment;

import java.util.Scanner;

public class Assignment5_1 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number: ");
	int n = sc.nextInt();
	int prev = 0;
	int curr = 1;
	System.out.println("The Fibonacci series is : ");
	for(int i=0;i<n;i++) {
		System.out.print(prev + " ");
		int next = curr + prev;
		prev = curr;
		curr = next;
		}
	}
}
