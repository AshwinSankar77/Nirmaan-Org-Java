package Day4;
import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table");
		int table = sc.nextInt();
		for(int i = 0;i<=10;i++) {
			System.out.println(table+"x"+i+"="+i*table);
		}
	
	sc.close();
	}
	
}