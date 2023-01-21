package com.assignment;

import java.util.Scanner;

public class Assignment6_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal number: ");
		double n = sc.nextDouble();
		System.out.println("Enter the number of precision digits: ");
		int k = sc.nextInt();
		int decimal = (int)n;
		double fractional = n - decimal;
		int decimal_binary = 0;
		int i = 1;
		while(decimal!=0) {
			int rem = decimal%2;
			decimal_binary += rem*i;
			i *=10;
			decimal /=2;
		}
		String s = Integer.toString(decimal_binary) +".";
		while(k>0 && fractional!=0) {
			fractional *= 2;
			int digit = (int)fractional;
			s = s+digit;
			fractional = fractional - digit;
			k--;
		}
		System.out.println(s);
	}

}
