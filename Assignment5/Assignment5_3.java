package com.assignment;

import java.util.Scanner;

public class Assignment5_3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		int ans =1;
		for(int i=1;i<=n;i++) {
			ans = ans *i;
		}System.out.println(ans);
	}

}
