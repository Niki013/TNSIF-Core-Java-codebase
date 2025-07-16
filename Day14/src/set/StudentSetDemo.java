package set;

import java.util.HashSet;
import java.util.Set;

public class StudentSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> set=new HashSet<Student>();
		set.add(new Student(101, "Niki", 45.09));
		set.add(new Student(102, "heti", 54.09));
		set.add(new Student(103, "Nisha", 67.09));
		set.add(new Student(104, "manvi", 23.87));
		set.add(new Student(101, "Niki", 45.09));
		set.add(new Student(101, "Niki", 76.09));
		
		System.out.println(set);

	}

}
