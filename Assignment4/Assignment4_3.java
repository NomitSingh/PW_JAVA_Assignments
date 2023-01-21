package com.assignment;

import java.util.Scanner;

public class Assignment4_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cost price");
		int cp= sc.nextInt();
		System.out.println("Enter the selling price");
		int sp = sc.nextInt();
		if(cp==sp) System.out.println("No profit no loss");
		else if(cp<sp) System.out.println("The profit is " + (sp-cp));
		else System.out.println("The loss is " + (cp-sp));
		
	}
}
