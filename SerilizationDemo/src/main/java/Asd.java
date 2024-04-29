import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Asd {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try {
			//Student s=new Student("93 Shinny Ave",1,"Snehal");
			// it will show errors because address class is not serilizable 
			FileOutputStream fout=new FileOutputStream("F.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(out);
			out.flush();
			out.close();
			System.out.println("Serilizable is done");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
