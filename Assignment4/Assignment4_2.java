package com.assignment;

import java.util.Scanner;

public class Assignment4_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number ");
	    int n = sc.nextInt();
	    int a = n;
	    if(n<0) {
	    	n = n*-1;
	    }
	    System.out.println("The absolute value of number (" + a + ") is " + n);
	}
}

