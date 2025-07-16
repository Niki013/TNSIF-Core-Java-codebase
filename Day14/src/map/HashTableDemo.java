package map;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer ,String> ht=new Hashtable<Integer ,String>();
		ht.put(101,  "mumbai");
		ht.put(102,  "pune");
		ht.put(104,  "new mumbai");
		ht.put(106,  "dubai");
		ht.put(101,  "maharashra");
		System.out.println(ht);
		
		ht.put(104, "pune");System.out.println(ht);
		
		ht.putIfAbsent(105, "baramati");
		ht.put(101, "baramati");
		System.out.println(ht);
		
		System.out.println(ht.get(103));
		
		ht.clone();
		System.out.println(ht);
		
		Set s=ht.keySet();
		System.out.println(s);
		Collection<String> c=ht.values();
		System.out.println(c);
		
		

	}

}
