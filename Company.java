package day11;

public class Company {
	private String empName;
	private int empId;
	private String dept;
	private long mobNo;
	
	public Company() {
		
	}
	public Company(String empName,int empId,String dept,long mobNo) {
		this.empName=empName;
		this.empId=empId;
		this.dept=dept;
		this.mobNo=mobNo;
	}
	String getEmpName() {
		
		return empName;
	}
	int getEmpId() {
		
		return empId;
	}
	String getDept() {
		
		return dept;
	}
	long getMobNo() {
		
		return mobNo;
	}
	void setEmpName(String empName) {
		
		this.empName=empName;
	}
	void setEmpId(int empId) {
		
		this.empId=empId;
	}
	void setDept(String dept) {
		
		this.dept=dept;
	}
	void setMobNo(long mobNo) {
		
		this.mobNo=mobNo;
	}
	public String toString() {
		return "Company{empName="+empName+",empId="+empId+",dept="+dept+"mobNo="+mobNo+"}";
	}
}



