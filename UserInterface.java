package day15;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		Scanner an=new Scanner(System.in);
		System.out.println("Enter 1st value");
		int a=an.nextInt();
		System.out.println("Enter 2nd value");
		int b=an.nextInt();
		System.out.println("Addition :"+calc.add(a,b));
		System.out.println("Subtraction :"+calc.sub(a,b));
		System.out.println("Multiplication:"+calc.mul(a,b));
		System.out.println("Division :"+calc.div(a,b));
	}

}
