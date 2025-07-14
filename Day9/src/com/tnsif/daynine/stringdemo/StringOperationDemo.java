package com.tnsif.daynine.stringdemo;

public class StringOperationDemo {
	public static void main(String[]args) {
		
		String s1=new String (" india ");
		System.out.println(s1);
		String s2=s1.toUpperCase();
		System.out.println(s2);
		System.out.println(s1.length());
		int a=s2.length();
		String s3=s1.substring(1,7);
		System.out.println(s3);
		
		
		System.out.println(s1.trim());
		System.out.println(s1.isEmpty());
		
		//String comparision
		s2=new String(s1);
		
		
		//==  --> check reference//equals  --> check equals
		
		System.out.println("casev1 :"+ s1.equals(s2));
		System.out.println("case 2 :"+ s1==s2);
		
		
	}

}
