import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class Serilized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Person1 s1=new Person1(1,"Snehal","OOSD",5000);
			FileOutputStream fout=new FileOutputStream("f.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(s1);
			
			out.flush();  //
			out.close();
			System.out.println("Serilization is done: \n"+s1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 try{  
			  //Creating stream to read the object  
			 FileInputStream fin=new FileInputStream("f.txt");
			 ObjectInputStream in=new ObjectInputStream(fin);
			  //ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
			 
			 
			  Person1 s=(Person1)in.readObject();  
			  //printing the data of the serialized object
			  System.out.println("Deserilization is done!!");
			  System.out.println(s.id+" "+s.name+" "+s.course+" "+s.fee);  
			  //closing the stream  
			  in.close();  
			  
			  }catch(Exception e){System.out.println(e);}  
			 }  

	}




