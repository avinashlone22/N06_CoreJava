// program to demonstrate on default and paramaterized 

package org.tnsif.classandobjects;

public class Library {
 public long noofBooks;
 public String authorName;
 public String bookName;
 public double price;
 
public Library(long noofBooks, String authorName, String bookName, double price) {
	super();
	this.noofBooks = noofBooks;
	this.authorName = authorName;
	this.bookName = bookName;
	this.price = price;
	
	System.out.println("parameterized constructor");
	
}

@Override
public String toString() {
	return "Library [noofBooks=" + noofBooks + ", authorName=" + authorName + ", bookName=" + bookName + ", price="
			+ price + "]";
}

public Library() {
	super();
	System.out.println("default constructor");
	// TODO Auto-generated constructor stub
}
 
}
