
package project1;
import java.sql.*;
import java.io.*;  


public class Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		
		/*
		 * Class.forName("com.mysql.cj.jdbc.Driver"); Connection
		 * con=DriverManager.getConnection(
		 * "jdbc:mysql://localhost:3306/test","root",""); //here sonoo is database name,
		 * root is username and password Statement stmt=con.createStatement(); ResultSet
		 * rs=stmt.executeQuery("select description from product where name='Iphone'");
		 * while(rs.next()) System.out.println(rs.getString(1)); con.close();
		 */
		
		
		//for inserting data into database
		
		/*
		 * Class.forName("com.mysql.cj.jdbc.Driver"); Connection
		 * con=DriverManager.getConnection(
		 * "jdbc:mysql://localhost:3306/test","root","");
		 * 
		 * PreparedStatement
		 * stmt=con.prepareStatement("Insert into product values(?,?,?)");
		 * stmt.setInt(1,3); stmt.setString(2,"Samsung");
		 * stmt.setString(3,"Samsung is liked by everyone");
		 * 
		 * int i=stmt.executeUpdate(); System.out.println(i+" records inserted");
		 * 
		 * con.close();
		 */
		
		
		//For Updating Data into Database
		
		/*
		 * Class.forName("com.mysql.cj.jdbc.Driver"); Connection
		 * con=DriverManager.getConnection(
		 * "jdbc:mysql://localhost:3306/test","root","");
		 * 
		 * PreparedStatement
		 * stmt=con.prepareStatement("update product set description=? where id=?");
		 * stmt.setString(1,"I love Microsoft"); stmt.setInt(2,2); // whenever we are
		 * updating something we don't need to set all the column of table just need to
		 * set only those are
		 * 
		 * int i=stmt.executeUpdate(); System.out.println(i+" records Updated");
		 * 
		 * con.close();
		 */
		
		
		/*
		 * Class.forName("com.mysql.cj.jdbc.Driver"); Connection
		 * con=DriverManager.getConnection(
		 * "jdbc:mysql://localhost:3306/test","root","");
		 * 
		 * PreparedStatement
		 * stmt=con.prepareStatement("delete from product where id=?");
		 * stmt.setInt(1,2); // whenever we are updating something we don't need to set
		 * all the column of table just need to set only those are
		 * 
		 * int i=stmt.executeUpdate(); System.out.println(i+" records Updated");
		 * 
		 * con.close();
		 */
		 
		  Class.forName("com.mysql.cj.jdbc.Driver"); 
		  Connection con=DriverManager.getConnection(
		  "jdbc:mysql://localhost:3306/test","root","");
		  
		  PreparedStatement ps=con.prepareStatement("Insert into product values(?,?,?)");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		  
		do{  
		System.out.println("enter id:");  
		int id=Integer.parseInt(br.readLine());  
		System.out.println("enter name:");  
		String name=br.readLine();  
		System.out.println("enter description:");  
		String des=br.readLine();  
		  
		ps.setInt(1,id);  
		ps.setString(2,name);  
		ps.setString(3,des);  
		int i=ps.executeUpdate();  
		System.out.println(i+" records affected");  
		  
		System.out.println("Do you want to continue: y/n");  
		String s=br.readLine();  
		if(s.startsWith("n")){  
		break;  
		}  
		}while(true);  
	}

}
