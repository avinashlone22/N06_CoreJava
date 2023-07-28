package org.tnsif.enscapsulation;

public class HDFC {


		public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public long getAtmno() {
		return atmno;
	}
	public void setAtmno(long atmno) {
		this.atmno = atmno;
	}
	public int getPinno() {
		return pinno;
	}
	public void setPinno(int pinno) {
		this.pinno = pinno;
	}
		// TODO Auto-generated method stub
		private String accType;
		private long accno;
		private long atmno;
		private int pinno;
		@Override
		public String toString() {
			return "HDFC [accType=" + accType + ", accno=" + accno + ", atmno=" + atmno + ", pinno=" + pinno + "]";
		}
		
	
}

