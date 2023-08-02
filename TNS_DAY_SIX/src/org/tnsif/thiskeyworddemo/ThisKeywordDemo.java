package org.tnsif.thiskeyworddemo;


class Account 
{
	long accountNo;
	
	void setData(long accountNo)

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
public class ThisKeywordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account();
		a.setData(123456789);
		a.dispaly();
	}

}
