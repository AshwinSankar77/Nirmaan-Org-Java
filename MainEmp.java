package day14;
import java.util.Scanner;
public class MainEmp {
	public static void main(String[] args) {
		EmpManagement em=new EmpManagement();
		Scanner an=new Scanner(System.in);
		boolean isTrue=true;
		while(isTrue) {
		System.out.println("Enter Employee Detail :");
		System.out.println("1 for Add");
		System.out.println("2 for Update");
		System.out.println("3 for Show");
		System.out.println("0 for Exit");
		int key =an.nextInt();
		an.nextLine();
		 switch (key) {
		case 1: {
			System.out.println("Enter Employee Name :");
			String empName=an.nextLine();
			em.setEmpName(empName);
			
			System.out.println("Enter Employee I'D :");
			int empId=an.nextInt();
			em.setEmpId(empId);
			
			System.out.println("Enter Departmant :");
			String dept=an.nextLine();
			em.setDept(dept);
			an.nextLine();
			System.out.println("Enter Employee Mobile Number  :");
			long mobNo=an.nextLong();
			em.setMobNo(mobNo);
			break;
			}
		case 2 :{
			System.out.println("Enter Employee Name :");
			String empName=an.nextLine();
			em.setEmpName(empName);
			
			System.out.println("Enter Employee I'D :");
			int empId=an.nextInt();
			em.setEmpId(empId);
			
			System.out.println("Enter Departmant :");
			String dept=an.nextLine();
			em.setDept(dept);
			an.nextLine();
			System.out.println("Enter Employee Mobile Number :");
			long mobNo=an.nextLong();
			em.setMobNo(mobNo);
			break;
		}
		case 3:{
			System.out.println(em);
			break;
		}
		case 0:{
			isTrue=false;
			System.out.println("Thank You");
			break;
		}
		
		}
	
	}
	}
}
