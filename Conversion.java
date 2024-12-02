package day7;

public class Conversion {
	String add (int a , int b) {
	return "add :"+(a+b);
	}

	String Sub (int a , int b) {
		return "Sub :"+(a-b);
		}

	String Mul (int a , int b) {
		return "Mul :"+(a*b);
		}

	String Div (int a , int b) {
		return "Div :"+(a/b);
		}

	String Mod (int a , int b) {
		return "Sub :"+(a%b);
		}
	
	public static void main(String[] args) {
		Conversion Ash =new Conversion();
		String number=Ash.add(50,20);
		System.out.println(number);
		
		String number1=Ash.Sub(50,20);
		System.out.println(number1);
		
		String number2=Ash.Mul(50,20);
		System.out.println(number2);
		
		String number3=Ash.Div(50,20);
		System.out.println(number3);
		
		String number4=Ash.Mod(50,20);
		System.out.println(number4);
	}
}
		
		
		
		
