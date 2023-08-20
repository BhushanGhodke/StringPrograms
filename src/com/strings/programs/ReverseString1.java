package com.strings.programs;

import java.util.Scanner;

public class ReverseString1 {

	public static void main(String[] args) {
	
	 System.out.println("Enter any String");
	 Scanner scanner = new Scanner(System.in);
	 
	 String a=scanner.nextLine();
	 
	 String b="";
	 
	 for(int i=a.length()-1;i>=0;i--) {
		 b=b+a.charAt(i);
	 }
	 System.out.println("Reverse String: "+b);
	
	}
}
