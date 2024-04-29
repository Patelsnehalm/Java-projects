package Java_Program;
import java.util.*;    
public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Map<Integer,Book> map=new LinkedHashMap<Integer,Book>();    
		    //Creating Books    
		    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
		    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
		    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);    
		    
		    map.put(1, b3);
		    map.put(2, b2);
		    map.put(3, b1);
		    
		    for(Map.Entry<Integer,Book> entry:map.entrySet())
		    {
		    	int key=entry.getKey();
		    	Book value=entry.getValue(); // Book is custom Generic that is why its book DataType.
		    	System.out.println(value.id+value.name+value.author);;
		    }
		    
		    

	}

}
