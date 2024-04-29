import java.io.Serializable;

public class Person implements Serializable {
	int id;
	String name;
	public Person(int id,String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return(this.getId()+" "+this.getName());
	}

}
