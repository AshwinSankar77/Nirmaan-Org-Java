package Day4;

import java.util.Scanner;

public class loops {
	public static void main(String [] args) {
			Scanner an =new Scanner(System.in);
			System.out.println("Enter your mark:");
			int mark= an.nextInt();
			an.close();
			if (mark>=35) {
					System.out.println("Pass");
			}
			if (mark<35) {
				System.out.println("Fail");
	}
			else if (mark>=90) {
				System.out.println("Grade A");
}
			else if (mark>=70) {
				System.out.println("Grade B");
}
			else if (mark>=50) {
				System.out.println("Grade c");
}
	
}
}