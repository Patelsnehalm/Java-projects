package Java_Program;

public class CloningDemo {
	
	  

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		AddressSHPA address1 = new AddressSHPA("King st.", "Cambridge", "Ontario");
		departmentDemo dept=new departmentDemo("CE");
		EmployeeSHPA emp1 = new EmployeeSHPA(1, "Mellisa", 5000, address1,dept);
		
		EmployeeSHPA emp2 = (EmployeeSHPA) emp1.clone();
		emp1.setName("Tony");
		emp1.getAddress().setCityName("Waterloo");
		emp2.getDepartment().setDepartmentName("CIVIL");
		System.out.println("emp1 = " + emp1);
		System.out.println("emp2 = " + emp2);
	}

}
