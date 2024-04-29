package Java_Program;

public class EmployeeSHPA implements Cloneable{
	private int empId;
	private String name;
	private int salary;
	private AddressSHPA address;
	private departmentDemo department;

	
	  public EmployeeSHPA(int empId, String name, int salary, AddressSHPA address, departmentDemo department) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.department = department;
	}

	@Override
	  protected EmployeeSHPA clone() throws CloneNotSupportedException {
	  EmployeeSHPA emp = (EmployeeSHPA) super.clone(); 
	  emp.setAddress((AddressSHPA) address.clone());
	  emp.setDepartment((departmentDemo) department.clone());
	  return emp;
	} 

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public AddressSHPA getAddress() {
		return address;
	}
	public void setAddress(AddressSHPA address) {
		this.address = address;
	}
	
	public departmentDemo getDepartment() {
		return department;
	}


	public void setDepartment(departmentDemo department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "EmployeeSHPA [empId=" + empId + ", name=" + name + ", salary=" + salary + ", address=" + address +" , department=" + department +"]";
	}

}
