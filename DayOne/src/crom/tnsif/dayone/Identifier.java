package crom.tnsif.dayone;

public class Identifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Invalid cases:
		// int for = 10; // Error: "for" is a keyword
		// int num 1 = 2; // Error: whitespace in variable name
		// int @num = 4; // Error: special character not allowed except _ and $

		// Valid identifiers:
		int sum = 20;
		String StudentName = "harry";
		int FOR = 20;

		System.out.println("Value of sum is: " + sum);
		System.out.println("Student name is: " + StudentName);
	}
}
