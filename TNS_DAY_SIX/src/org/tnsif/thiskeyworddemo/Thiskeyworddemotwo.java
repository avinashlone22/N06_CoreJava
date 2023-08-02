package org.tnsif.thiskeyworddemo;

class Bank
{
	long accountNo;
	
	Bank (long accountNo)

{
	this.accountNo=accountNo;
	
}
	void dispaly()
	{
		System.out.println(accountNo);
	}
	void setData(long accountNo)
	{
		this.accountNo = accountNo;
		
	}
}
public class Thiskeyworddemotwo {
	public static void main(String[] args )
	{
		Bank b = new Bank(23456);
		b.dispaly();
	}

}
