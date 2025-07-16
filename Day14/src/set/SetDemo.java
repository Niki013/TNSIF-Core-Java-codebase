package set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String args[]) {
		
		Set<Integer>set=new HashSet<Integer>();
		set.add(100);
		set.add(20);
		set.add(50);
		set.add(90);
		set.add(70);
		set.add(20);
		
		System.out.println(set);
		boolean b=set.contains(20);
		System.out.println(b);
		
		boolean b1=set.isEmpty();
		System.out.println(b1);
		
		
		}

}
