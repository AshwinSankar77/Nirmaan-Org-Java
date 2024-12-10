package day14;

public class EmpManagement {
	private String empName;
	private int empId;
	private String dept;
	private long mobNo;
	
	public EmpManagement() {
		
	}
	public EmpManagement(String empName, int empId,String dept,long mobNo) {
		this.empName=empName;
		this.empId=empId;
		this.dept=dept;
		this.mobNo=mobNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public long getMobNo() {
		return mobNo;
	}
	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}
	@Override
	public String toString() {
		return "EmpManagement [empName=" + empName + ", empId=" + empId + ", dept=" + dept + ", mobNo=" + mobNo + "]";
	}
	

}
