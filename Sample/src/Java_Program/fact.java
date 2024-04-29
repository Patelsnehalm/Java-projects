package Java_Program;



public class fact {
	
	static int factorial(int n)
	{
	  if(n==0||n==1)
	  {return 1;}
	  else
	  {
		  return n*factorial(n-1);
	  }
	  
		
	}
	public static void main(String[] args) {
		//factorial(5);
		System.out.println("Factorial of 5 is:"+factorial(5));
		
	}

}
