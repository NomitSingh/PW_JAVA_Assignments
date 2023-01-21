package com.assignment;

import java.util.Scanner;

public class Assignment3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println((((x+8)/3)%5)*5);
	}
}
