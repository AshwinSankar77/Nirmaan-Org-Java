package day11;
public class MainCompany {
	public static void main(String[] args) {
		Company co = new Company();
		
//		System.out.println("EmpName :"+co.getEmpName());
//		System.out.println("EmpId :"+co.getEmpId());
//		System.out.println("Dept :"+co.getDept());
//	    System.out.println("MobNo :"+co.getMobNo());
		
		co.setEmpName("Ashwin");
		co.setEmpId(12345);
		co.setDept("Developer");
		co.setMobNo(1234567891);
		
		System.out.println("UpdatedEmpName :"+co.getEmpName());
		System.out.println("UpdatedEmpId :"+co.getEmpId());
		System.out.println("UpdatedDept :"+co.getDept());
		System.out.println("UpdatedMobNo :"+co.getMobNo());
	}

}
