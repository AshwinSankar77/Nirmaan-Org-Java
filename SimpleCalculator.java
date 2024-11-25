package Day3;
import java.util.Scanner;
public class SimpleCalculator {
	public static void main(String[] args) {
	Scanner an = new Scanner(System.in);
	System.out.println("Enter your Firtst Number:");
  int firstNum=an.nextInt();
  System.out.println("Enter your Second Number:");
  int secondNum=an.nextInt();
  
  System.out.println("Enter your choice:");
  System.out.println("0 for add");
  System.out.println("1 for sub");
  System.out.println("2 for mul");
  System.out.println("3 for div");
  System.out.println("4 for mod");
  int key = an.nextInt();
  an.close();
   switch (key) {
case 0: {
	int total=(firstNum+secondNum);
	System.out.println("Addition :"+total);
	break;
}
default:
	System.out.println("Enter the correct choice :");
	switch (key) {
	case 1: {
		int total=(firstNum-secondNum);
		System.out.println("Subtraction :"+total);
		break;
		}
	}
	case 2 :{
		int total=(firstNum*secondNum);
		System.out.println("Multiplication :"+total);
		break;
		}
case 3:{
	int total=(firstNum/secondNum);
	System.out.println("Division :"+total);
	break;
}
   case 4:{
	   int total=(firstNum%secondNum);
		System.out.println("Modulus :"+total);
		break;
	}
}
}
}

//if (key==0)
//{
//int total=(firstNum+secondNum);
//System.out.println("Addition :"+total);
//}
//else if (key==1)
//{
//  int total=(firstNum-secondNum);
//  System.out.println("Subtraction :"+total);
//}
//else if (key==2)
//{
//	  int total=(firstNum*secondNum);
//	  System.out.println("Multiplication :"+total);
//}
//else if (key==3)
//{
//		  int total=(firstNum/secondNum);
//		  System.out.println("Division :"+total);
//}
//else if (key==4)
//{ 
//  int total=(firstNum%secondNum);
//  System.out.println("Modulus :"+total);
