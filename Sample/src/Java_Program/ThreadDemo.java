package Java_Program;

class test implements Runnable
{
	public void run()
	{
		System.out.println("Inside a Thread");
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t=new test();
		Thread t1=new Thread(t);
		t1.start();

	}

}
