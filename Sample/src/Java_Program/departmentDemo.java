package Java_Program;

public class departmentDemo implements Cloneable {
	private String departmentName;

	public departmentDemo(String departmentName) {
		super();
		this.departmentName = departmentName;
		System.out.println("Constructor is Called");
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return departmentName;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		departmentDemo d1=new departmentDemo("IT");
		departmentDemo d2=(departmentDemo) d1.clone();
		
		System.out.println(d1);
		System.out.println(d2);
	}
}
