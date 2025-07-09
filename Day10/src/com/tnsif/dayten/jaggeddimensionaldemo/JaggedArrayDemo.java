package com.tnsif.dayten.jaggeddimensionaldemo;

class JaggedArray
{
	public static void printArray(int c[][]) {
		System.out.println("Array of element are as follow");
		for(int i=0; i<=c.length; i++) {
			for( int j=0; j<c.length;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}

public class JaggedArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[][]= { {12,34,60},{10,20,30},{1,2},{78,87,56,89,23}};
		System.out.println("No. of row in c Array:"+c.length);
JaggedArray.printArray(c);
	}

}
