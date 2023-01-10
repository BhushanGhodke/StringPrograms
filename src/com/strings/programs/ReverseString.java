package com.strings.programs;

import java.util.Scanner;

//Write a program for Reverse String 
public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println("Enter any String ");
		Scanner scanner = new Scanner(System.in);
		String s=scanner.next().toLowerCase();
		char[]ch= s.toCharArray();
		String a= "";
		for(int i=ch.length-1;i>=0;i--) {
			a=a+ch[i];
			
		}
		
		System.out.println("Reverse String is: "+a);
	 
		if(s.equals(a)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	
	}
}
