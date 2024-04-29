package Java_Program;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serilization {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try {
			student s1=new student(1,"Snehal");
			FileOutputStream fout=new FileOutputStream("f.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();
			out.close();
			System.out.println("Serilization is done");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
