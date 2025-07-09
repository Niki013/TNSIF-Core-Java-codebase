package com.tnsif.dayten.singledimensionaldemo;

public class Student {

	
	private int rollNo;
	private String name;
	
	//para
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	
	//defualt

	public Student() {
		super();
	}



//geeter setter
	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
