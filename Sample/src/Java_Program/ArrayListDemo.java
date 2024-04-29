package Java_Program;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr=new ArrayList<Integer>((Arrays.asList(10,20,30,40,50)));
		
		arr.forEach(el-> System.out.println(el));
		
		arr.stream().forEach(el-> System.out.println(el));

		
		HashMap<String , Integer> h1=new HashMap<>();
		h1.put("s1", 1);
		h1.put("s2", 1);
		h1.put("s3", 1);
		h1.put("s4", 1);
		h1.put("s4", 1);//Store only unique key
		
		HashMap<String , Integer> h3=new HashMap<>();
		h1.put("s1", 1);
		h1.put("s2", 1);
		h1.put("s3", 1);
		h1.put("s4", 1);
		h1.put("s4", 1);//Store only unique key
		

		
		HashMap<String , Integer> h2=new HashMap<>();
		h1.put("s1", 1);
		h1.put("s2", 1);
		h1.put("s3", 1);
		h1.put("s5", 1);
		h1.put("s6", 1);
		
		// HashSet Store only unique Keys .
		
		HashSet< String> combine=new HashSet<>(h1.keySet());
		combine.addAll(h2.keySet());
		
		boolean h11=( new ArrayList<>(h1.values()).equals(new ArrayList<>(h3.values())));
		System.out.println(h11);
		
		
		//Doesn't maintain any insertion order.
		//It allows only one null key and multiple null values.
	
		//HashMap allow us to store key and value pair where key should be unique.
		
		System.out.println(combine);
		
		Map<String, String> map5=Stream.of(new String[][] {
			{"S" ,"A "},
			{"D", "A+"},
			{"F","B+"}
		}).collect(Collectors.toMap(data->data[0], data->data[1]));
		
		
		Map<Integer, Integer> map55=Stream.of(new Integer[][] {
			{1,1},
			{2,2}
		}).collect(Collectors.toMap(data->data[0], data->data[1]));
		
		System.out.println(map55);
		
		Map<Object, Object> map6= Stream.of(new AbstractMap.SimpleEntry<>("Naveen","Patel"),
				new AbstractMap.SimpleEntry<>("Snehal","Patel"),
				new AbstractMap.SimpleEntry<>("Aadil","Patel")).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		
		
		System.out.println(map6);
		
		
		
		
		
		
		
		
	}

}
