package Java_Program;

class Encapsulated
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encapsulated e=new Encapsulated();
		e.setName("Snehal");
	    System.out.println(e.getName());	
	}

}
