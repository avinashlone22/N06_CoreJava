package org.tnsif.superkeyword;

class Google{
	
	String ceo ;
	public Google(String ceo) {
		System.out.println( " ceo is "+ceo);
	}
}
class Gmail extends Google
{
	String userid ;

	public Gmail(String ceo, String userid) {
		super(ceo);
		this.userid = userid;
		System.out.println("user id is "+userid);
	}

	
}
	
public class Superwithconstructor {
	public static void main(String[] args)
	{
		Gmail g = new Gmail("Avinash","abc@gmail.com"
				);
		
	}

}
