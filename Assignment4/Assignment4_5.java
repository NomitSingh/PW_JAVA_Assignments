package com.assignment;

import java.util.Scanner;

public class Assignment4_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Float a,b;
		System.out.println("Enter first number : ");
		a = sc.nextFloat();
		System.out.println("Enter second number : ");
		b = sc.nextFloat();
		System.out.println("Enter the operators : '+' , '-', '*', '/' ");
		char option = sc.next().charAt(0);
		
		switch(option) {
		case '+': 
			System.out.println(a + " + " + b + " = " + (a+b));
			break;
		case '-':
			System.out.println(a + " - " + b + " = " + (a-b));
			break;
		case '*':
			System.out.println(a + " * " + b + " = " + (a*b));
			break;
		case '/':
			System.out.println(a + " + " + b + " = " + (a+b));
			break;
		default:
			System.out.println("Wrong operator !");
			break;
		}
	}
}
