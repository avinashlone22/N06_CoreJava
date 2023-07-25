// program to demonstrate on class and objedct 
// driver class

package org.tnsif.classandobjects;

public class EmployeeExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e =new Employee();
		e.empID=1234;
		e.empName="avinash";
		e.department="engineering" ;
		e.salary=900000;
		e.display();
		System.out.println();
		
		Employee e1 =new Employee();
		e1.empID=1234;
		e1.empName="avinash";
		e1.department="engineering" ;
		e1.salary=900000;
		e1.display();
	}

}
