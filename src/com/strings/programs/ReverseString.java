package com.strings.programs;
//Write a program for Reverse String 
public class ReverseString {

	public static void main(String[] args) {
		
		String s="Java Developer";
		char[]ch= s.toCharArray();
		String a= "";
		
		for(int i=ch.length-1;i>=0;i--) {
			a=a+ch[i];
			
		}
		System.out.println("Reverse String is "+a);
	}
}
