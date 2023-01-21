package com.assignment;

import java.util.Scanner;

public class Assignment2_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String firstname = sc.next();
		String lastname = sc.next();
		int RN = sc.nextInt();
		String field = sc.next();
		System.out.println("Name : " + firstname + " " + lastname);
		System.out.println("Roll Number : " + RN);
		System.out.println("Field of Interest : " + field);
	}
}
