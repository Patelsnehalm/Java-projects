package Java_Program;

public class mainMethodOveride {
	
	public static void main(int i)
	{
		main(10);
		System.out.println("Main method is runnning!!");
	}
	
	
}
class derived extends mainMethodOveride
{
	public static void main(int a)
	{
		System.out.println(a);
	}

	
}
