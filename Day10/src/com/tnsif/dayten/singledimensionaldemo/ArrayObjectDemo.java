package com.tnsif.dayten.singledimensionaldemo;

public class ArrayObjectDemo {
	public static void main(String args[]) {
		
		Stuent [] arr;
		//decleare meme for  obj or type student
		
		arr=new Student[5];
		
		arr[0] =new Student(100,"heti");
		arr[1] =new Student(101,"hema");
		arr[2] =new Student(102,"hena");
		arr[3] =new Student(103,"tanu");
		arr[4] =new Student(104,"riya");
		
		for(int i=0;i<=arr;i++)
		{
			System.out.println("Element at"+ i+" :"+arr[i])
		}
	}

}
