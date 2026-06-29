package com.janhvi;

import java.util.Scanner;

public class Even_odd {
	public static void main(String[] args) {
		Scanner Sc = new  Scanner(System.in) ;
		System.out.println("Enter a number:");
		int num = Sc.nextInt();
		if (num % 2 == 0)
		{
			System.out.println("Even number.");
		} else {
			System.out.println("Odd number.");
		}
	}

}
