package day15;

import java.util.Scanner;

public class AxisBank {
	
	public static void main(String[] args) {
		Bank bank=new Bank();
		Scanner an =new Scanner(System.in);
		bank.setAccName("Ashwin");
		bank.setAccNo(2221077757l);
	  
	   		 
	    boolean isTrue=true;
	  while (isTrue){
	 		  
		System.out.println("Enter your choice :");
		System.out.println("1 for Account Details");
		System.out.println("2 for Deposit");
		System.out.println("3 for Withdrawal");
		System.out.println("4 for Account Details");
		System.out.println("0 for Exit");
		int i=an.nextInt();
		if(i==1) {
			System.out.println("Enter your Pin :");
			int pin=an.nextInt();
			if(bank.getPin()==pin){
				System.out.println("Account Details");
				System.out.println(" ");
			    System.out.println("Account Name\t:"+bank.getAccName());
				System.out.println("Account Number\t:"+bank.getAccNo());
				System.out.println("Account Balance\t :"+bank.getAccBal());
			}
			else {
				System.out.println("!!!Incorrect Pin!!!");
			}
		}
			else if(i==2) {
			    System.out.println("Deposit Amount :");				
				bank.addition(an.nextDouble());
				System.out.println("Amount Deposited");
				}
			else if(i==3) {
				System.out.println("Enter Withdrawal Amount :");
				bank.subtraction(an.nextDouble());				
				System.out.println("Amount Deducted");
			}
			else if(i==4) {
				System.out.println("Account Number :"+bank.getAccNo());
				System.out.println("Account Name\t:"+bank.getAccName());
				System.out.println("Account Balance\t :"+bank.getAccBal());
			}
			else if(i==0){
				System.out.println("Thank You");
			}else {
				System.out.println("Choose the number between 1 to 0");
			}						
}		
	}
}	




















