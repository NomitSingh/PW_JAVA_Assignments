package com.assignment;

import java.util.Scanner;

public class Assignment2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mark1 = sc.nextInt();
		int mark2 = sc.nextInt();
		int mark3 = sc.nextInt();
		int total = mark1+mark2+mark3;
		int percentage = total/3;
		System.out.println("Total marks: " + total);
		System.out.println("Percentage marks: " + percentage + "%");
	}
}
