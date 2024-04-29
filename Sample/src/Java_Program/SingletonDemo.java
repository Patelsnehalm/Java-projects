package Java_Program;
class XyzSHP{
//	public static XyzSHP obj = new XyzSHP();		// Eager Loading
	
	public static XyzSHP obj;	
	
	private XyzSHP(){
		System.out.println("Object created");
	}
	
	public static XyzSHP getInstance() {
		if(obj == null) {
			obj = new XyzSHP();						// Lazy Loading
		}
		return obj;
	}
}

public class SingletonDemo {

	public static void main(String[] args) {
		XyzSHP object = XyzSHP.getInstance();
		XyzSHP object2 = XyzSHP.getInstance();

		if(object == object2){
			System.out.println("Same");
		} else {
			System.out.println("Not Same");
		}
	}

}
