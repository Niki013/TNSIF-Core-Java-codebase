package crom.tnsif.dayone;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//implicite or widing
		 byte b=10;
		 int i = b;
		 System.out.println(i);
		 
		 float f =22.14f;
		 double d=f;
		 System.out.println(d);
		 
		 //Explicit //narrowing
		 
		 double d1= 10.52f;
		 long l =(long) d1;
		 System.out.println(l);
		 
		 long g = 7350702170f;
		 int n =(int)g;
		 System.out.println(n);
		 
		 short s=130;
		 byte m=(byte)s;
		 System.out.println(m);
		 

	}

}
