package Java_Program;

class Animal{
 
	public void eat()
	{
		System.out.println("Animals are eating11");
	}
}
class Dog extends Animal

{
	public void eat()
	{
		System.out.println("Dogs are eating");
	}
	public void Run()
	{
		System.out.println("Running method is invoked");
	}
}

public class InDemo extends Dog {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InDemo in=new InDemo();
		//Animal ref=new Animal();
		in.eat();
		in.Run();
		//ref=new Dog();
		//ref=new InDemo();
		//ref.eat();

	}

}
