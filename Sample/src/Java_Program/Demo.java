package Java_Program;
class OverloadDemo
{
	int i,j,result;
	public OverloadDemo() {
		// TODO Auto-generated constructor stub
		System.out.println("Default construcotr is called!");
	}
	public OverloadDemo(int k, int l) {
		// TODO Auto-generated constructor stub
		i=k;
		j=l;

		 result=j+k;
	}

}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OverloadDemo od=new OverloadDemo();
		OverloadDemo od1=new OverloadDemo(10,20);
		System.out.println("Value is :"+od1.result);

	}

}
