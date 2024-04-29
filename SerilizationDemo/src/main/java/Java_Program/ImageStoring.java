package Java_Program;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class ImageStoring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/test","root","");  
			              
			PreparedStatement ps=con.prepareStatement("insert into imgtable values(?,?)");  
			ps.setString(1,"sonoo");  
			  
			FileInputStream fin=new FileInputStream("d:\\cat.jpg");  
			ps.setBinaryStream(2,fin,fin.available());  
			int i=ps.executeUpdate();  
			System.out.println(i+" records affected");  
			          
			con.close();  
			}catch (Exception e) {e.printStackTrace();}  
			}  

}


