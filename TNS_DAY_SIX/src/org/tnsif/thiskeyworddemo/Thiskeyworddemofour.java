package org.tnsif.thiskeyworddemo;

class Director 
{
String name ;
void print()
{
	this.name="Sunil Datt";
	display(name);
}
void display(String name)

{
	System.out.println( " director name is " + name );
	
}
}

public class Thiskeyworddemofour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director d = new Director();
		d.print();
	}

}
