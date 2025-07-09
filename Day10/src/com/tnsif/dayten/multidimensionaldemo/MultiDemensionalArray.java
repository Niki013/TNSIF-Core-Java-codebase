package com.tnsif.dayten.multidimensionaldemo;


class MArray
{
	public static void printArray(int c[][]) {
		System.out.println("Array of element are as follow");
		for(int i=0; i<=c.length; i++) {
			for( int j=0; j<c.length;j++) {
				System.out.println(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}





public class MultiDemensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[][]= { {12,34},{10,20},{1,2},{78,87}};
		System.out.println("No. of row in c Array:"+c.length);
MArray.printArray(c);

	}

}
