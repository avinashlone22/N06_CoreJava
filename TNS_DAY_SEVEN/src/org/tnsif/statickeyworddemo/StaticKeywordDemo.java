package org.tnsif.statickeyworddemo;


class Employee 
{
	private int empid;
	private String name;
	private static String companyName="tnsif";
	
	// getter and setter 
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}


	public void dispaly()
	{
	System.out.println( "emp id :"+this.getEmpid() +" " +" Emp Name :" +this.getName()+" "+" company name :" +this.getCompanyName() );
	}
}
// driver class 
public class StaticKeywordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		e.setEmpid(1);;
		e.setName("Avinash");
		e.dispaly();

		Employee e1 = new Employee();
		e1.setEmpid(5);
		e1.setName("Avi");
		e1.dispaly();


	}

}
