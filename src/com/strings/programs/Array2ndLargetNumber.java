package com.strings.programs;

public class Array2ndLargetNumber {

	public static void main(String[] args) {
		
		int[]a= {10,20,14,54,78};
		int temp=a[0];
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]<a[j]) {
			       temp=a[i];
			       a[i]=a[j];
			       a[j]=temp;
					
				}
				
			}
		}
		System.out.println(a[1]);
		
	}
}
