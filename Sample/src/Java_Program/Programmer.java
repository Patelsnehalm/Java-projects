package Java_Program;

public class Programmer extends Employee {
	int bonus=2000;
	
	 public static void main(String args[]){  
		   Programmer p=new Programmer();  
		   System.out.println("Programmer salary is:"+p.salary);  
		   System.out.println("Bonus of Programmer is:"+p.bonus);  
      }
}
