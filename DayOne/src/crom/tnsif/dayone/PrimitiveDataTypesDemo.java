package crom.tnsif.dayone;

public class PrimitiveDataTypesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//byte takes 1 byte
		//1byte = 8 bit   //2^8 = 256
		//256/2 =128    //min value of byte
		
		byte byteMax = 127;
		byte byteMin = -128;
		System.out.println("Min range of byte is :" +byteMin + "Max range of byte is " + byteMax);
		
		//short ------2 byte
		short shortMax= 32767;
		short shortMin= -32768;
		System.out.println("Min range of byte is :" +shortMin + "Max range of byte is " + shortMax);
		
		// int -----4 byte
		int intMax =2,147,483,647;
		int intMin = -2,147,483,648;
		System.out.println("Min range of byte is :" +intMin + "Max range of byte is " + intMax);
		
		//long ----8byte
		
		long longMax=9,223,372,036,854,775,807;
		long longMin = -9,223,372,036,854,775,808;
		System.out.println("Min range of byte is :" +longMin+ "Max range of byte is " + longMax);
		
		float f=3234.141243278345f;
		double d=3456.14122134454545677888f;
		
		boolean flag = false;
		boolean flag1=true;
		
		
		
	}

}
