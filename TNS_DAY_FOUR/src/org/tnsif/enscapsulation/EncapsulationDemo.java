package org.tnsif.enscapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC h =new HDFC();
		h.setAccno(39898);
		h.setAccType("savings");
		h.setPinno(5675);
		h.setAtmno(24345654);
		System.out.println(h);
	}

}
