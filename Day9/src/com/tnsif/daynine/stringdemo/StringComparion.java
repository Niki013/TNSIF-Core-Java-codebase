package com.tnsif.daynine.stringdemo;

public class StringComparion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// pool memory
		String s1="TNSIF";
		String s2="TNSIF";
		
		// heap memory
		String s3=new String("TNSIF");
		String s4=new String("TNSIF");
		
		//== equals
		System.out.println("CASE1: "+ (s1==s2));
		System.out.println("CASE1: "+ (s1==s3));
		System.out.println("CASE1: "+ (s2.equals(s1)));
		System.out.println("CASE1: "+ (s2.equals(s4)));
		System.out.println("CASE1: "+ (s3==s4));
		System.out.println("CASE1: "+ (s3.equals(s4)));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		//campare by using campareTo
		System.out.println(s1.compareTo(s4));
		
		System.out.println(s1.compareToIgnoreCase(s4));
		
		
		
	}

}
