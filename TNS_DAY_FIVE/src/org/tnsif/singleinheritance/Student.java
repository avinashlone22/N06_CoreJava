package org.tnsif.singleinheritance;

public class Student  extends Citizen{

	private int rollno;
	private String collegename;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	
	// 
	
	public Student(String city, int pincode, String area, long adharno,int rollno,String collegename) {
		super(city, pincode, area, adharno);
		// TODO Auto-generated constructor stub
		
		this.rollno=rollno;
		this.collegename=collegename;
		
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegename=" + collegename + ", toString()=" + super.toString() + "]";
	}
	
	
}
