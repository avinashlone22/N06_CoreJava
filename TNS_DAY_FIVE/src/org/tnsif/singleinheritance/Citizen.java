package org.tnsif.singleinheritance;

public class Citizen {
	
	private String city;
	private int pincode;
	private String area;
	private long adharno;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public long getAdharno() {
		return adharno;
	}
	public void setAdharno(long adharno) {
		this.adharno = adharno;
	}
	@Override
	public String toString() {
		return "Citizen [city=" + city + ", pincode=" + pincode + ", area=" + area + ", adharno=" + adharno + "]";
	}
	// default constructor 
	public Citizen() {
		super();
		System.out.println(" citizen -parent class");
		
		// TODO Auto-generated constructor stub
	}
	// parameterized constructor 
	
	public Citizen(String city, int pincode, String area, long adharno) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.area = area;
		this.adharno = adharno;
	}
	
	

}
