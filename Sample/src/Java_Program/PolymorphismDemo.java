package Java_Program;



class Monkey
{
	int asd=16;
	String name;
	public Monkey() {
	
		
		// TODO Auto-generated constructor stub
		System.out.println("Dog class is invoked");
	}
		
	  public int add(int a,int b) { return a+b; }
	 
}
class Cat extends Monkey
{
	int asd=16;
	public Cat() {
		 super();
		 System.out.println(super.asd);
		// TODO Auto-generated constructor stub
		System.out.println("Cat Class is invoked");
	}
	
	  public int add(int a,int b) { //super(); 
		  //System.out.println(super.add(15,65));
		  return a+b; }
	 
	 
	
}

public class PolymorphismDemo {
	public static void main(String args[])
	{
		
		Cat c=new Cat();
		System.out.println("data member of parent class:");
	    System.out.println(c.add(10, 20));	
		//when we are creating an object of subclass it will run all the constructor of parent class
	}

}
