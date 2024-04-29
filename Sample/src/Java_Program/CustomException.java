package Java_Program;

import java.util.Scanner;

class InvalidAgeException  extends Exception  
{  
    public InvalidAgeException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  
public class CustomException {

	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub
		
	int age = 0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter your age:");
	age=sc.nextInt();
	if(age<18)
	{
		throw new InvalidAgeException("Under 18");
	}else
	{
		System.out.println("Youre Welcome!!");
	}

	}

}
