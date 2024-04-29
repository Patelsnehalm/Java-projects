package Java_Program;

public class StatVariable {
	int rollno;
	String name;
	static String college="SAIT";
	
	public StatVariable(int i,String n) {
		rollno=i;
		name=n;	
	}
	void Display()
	{
		System.out.println("Student Information:"+rollno+" "+name+" "+college);
	}

}
