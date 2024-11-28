package day6;

public class Student {
	String studentName="";
	int age=0;
	String gender="";
	int numofSubjects=0;
	
	public static void main(String[] args) {
		Student Student1=new Student();
		Student1.studentName="Ashwin";
		Student1.age=20;
		Student1.gender="Male";
		Student1.numofSubjects=5;
		System.out.println(Student1.studentName);
		System.out.println(Student1.age);
	    System.out.println(Student1.gender);
	    System.out.println(Student1.numofSubjects);
	   
	Student Student2=new Student();
	Student2.studentName="Nivashini";
	Student2.age=20;
	Student2.gender="Female";
	Student2.numofSubjects=5;
	System.out.println(Student2.studentName);
	System.out.println(Student2.age);
	System.out.println(Student2.gender);
	System.out.println(Student2.numofSubjects);
	System.out.println("Nivashini punda not used till date");
	}
}
