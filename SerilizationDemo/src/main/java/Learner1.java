import java.io.Serializable;

public class Learner1 implements Serializable {
	 int id;  
	 String name;  
	 Address address;//HAS-A  
	 
	 public Learner1(int id,String name) {
		// TODO Auto-generated constructor stub
		 this.id=id;
		 this.name=name;
	}

}
