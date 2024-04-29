

@SuppressWarnings("serial")
public class Student extends Address{
	int id;
	//String name;

	Student(String addressLine, String city, String state,int id) {
		super(addressLine, city, state);
		this.id=id;
		
	}
	
	//private static final long serialVersionUID = 1L;

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return("student Id is:"+this.getId()+"Student name is:"+"Address:"+super.addressLine+super.city+super.state);
	//	return("Student Id is:"+this.getId()+"  "+"Student name is:"+this.getName()+super.addressLine);
	}
}
