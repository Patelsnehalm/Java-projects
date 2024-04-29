import java.io.Serializable;

public class Address implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String addressLine;
	 String city;
	 String state; 
	 
	  Address(String addressLine, String city, String state) {    
	  this.addressLine=addressLine;    
	  this.city=city;    
	  this.state=state;    
	 }    

}
