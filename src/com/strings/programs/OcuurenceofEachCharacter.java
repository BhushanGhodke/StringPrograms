package com.strings.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OcuurenceofEachCharacter {

	public static void main(String[] args) {
		
		System.out.println("Enter any String");
		Scanner scanner = new Scanner(System.in);
		String a=scanner.next().toLowerCase();
	    char []ch=a.toCharArray();
	    
	    Map<Character , Integer> map = new HashMap<Character, Integer>();
	    
	    for(char x:ch) {
	    	
	    	if(map.containsKey(x)){
	    		
	    		map.put(x, map.get(x)+1);
	    	}
	    	else {
	    		map.put(x, 1);
	    	}
	    	
	    }
	    
	   System.out.println(map);
	    
	}
}
