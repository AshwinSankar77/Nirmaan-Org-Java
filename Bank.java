package day15;

public class Bank {
	private long accNo;
	private String accName;
	private double accBal=30000;
	private int pin=4485;
	public double x;
	public Bank(){
		
	}

	public Bank(long accNo, String accName, double accBal, int pin) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accBal =accBal;
		this.pin = pin;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getAccBal() {
		return accBal;
	}

	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	public double addition(double newdep) {
		x=newdep+accBal;
		this.accBal = x;
		return accBal;
	}
	public double subtraction(double wd) {
		 x=accBal-wd;
		 this.accBal =x;
		return accBal;
	}
	@Override
	public String toString() {
		return "Bank Account Number\t:" + accNo +"\nAccount Holder Name\t:" + accName +"\nAccount Balance\t:" + accBal;
	}
	
	

}
