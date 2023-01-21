package com.assignment;

import java.util.Scanner;

public class Assignment4_6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks: ");
		int marks = sc.nextInt();
		if(marks>=90) System.out.println("A+");
		else if(marks>=70&&marks<80) System.out.println("B+");
		else if(marks>=80&&marks<90) System.out.println("A");
		else if(marks>=60&&marks<70) System.out.println("B");
		else if(marks>=50&&marks<60) System.out.println("C");
		else if(marks>=40&&marks<50) System.out.println("D");
		else if(marks>=30&&marks<40) System.out.println("E");
		else if(marks>=0&&marks<30) System.out.println("F");
		else System.out.println("Enter valid marks ");
	}

}
