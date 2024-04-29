package Java_Program;

public class StatMethod {
	int rollno;
	String name;
	static String college="Conestoga";
	//Static Method can access Static Variable Directly
	//Static method can be invoked without the need of creating an instance of Class.
	static void Change()
	{
		college="SAIT";
	}
	StatMethod(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.print("Snehal");
		System.out.print("Student Info:"+rollno+" "+name+" "+college);
	}
	public static void main(String args[])
	{
		StatMethod s=new StatMethod(1, "Snehal");
		System.out.print("HII");
	}

}
