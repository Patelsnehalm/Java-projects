package Java_Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;




public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> hashMap=new HashMap<>();
		hashMap.put("Java", 95);
		hashMap.put("Ruby", 90);
		hashMap.put("C", 98);
		hashMap.put("Python", 80);
	
	//	Collections.sort((List<T>) hashMap);
		
		Iterator<String> it=hashMap.keySet().iterator();
		
		while (it.hasNext()) {
			String key = (String) it.next();
			//System.out.println(key);
			Integer values=hashMap.get(key);
			System.out.println(key+" "+values);
			
		}	
		
		System.out.println("++++++++++++++++++++++++++");
		Iterator it1=hashMap.entrySet().iterator();
		while (it1.hasNext()) {
			Object object = (Object) it1.next();
			System.out.println(object);
			
		}
		
		System.out.println("++++++++++++++++++++++++++");
		Iterator<Entry<String, Integer>> it2=hashMap.entrySet().iterator();
		
		while (it2.hasNext()) {
			Entry<String, Integer> entry= it2.next();
		System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println("++++++++++++++++++++++++++");
		
		
		hashMap.forEach((K,v)-> System.out.println(K+" "+v));
		
		//Some Comparison with help of key,value and key value pair
		
		
		HashMap< Integer,String> h1=new HashMap<>();
		h1.put(1,"A");
		h1.put(2,"B");
		h1.put(3,"C");

		
		HashMap< Integer,String> h2=new HashMap<>();
		h2.put(1,"A");
		h2.put(2,"B");
		h2.put(3,"C");
		
		
		HashMap< Integer,String> h3=new HashMap<>();
		h3.put(1,"A");
		h3.put(2,"B");
		h3.put(3,"C");
		h3.put(4,"D");
		//h3.put(4, "E");
		System.out.println("===========================");
		
		//Collections.sort((List<T>) h3);
	System.out.println(	h1.keySet().equals(h2.keySet()));
	System.out.println(	h1.keySet().equals(h3.keySet())); //IT WILL RETURN TRUE BECAUSE IT IS WORKING BASED ON KEY SO WHENEVER IT WILL FIND A SAME KEY ,IGNORE IT.
		
		
	System.out.println("===========================");
	
	HashSet<Integer> combineKeys=new HashSet<>(h3.keySet());
	combineKeys.addAll(h2.keySet());
	combineKeys.removeAll(h2.keySet());
	System.out.println(combineKeys);
	
	System.out.println("===================based on values========");	
	
System.out.println((new ArrayList<>(h1.values()).equals(h2.values())));
System.out.println((new ArrayList<>(h1.values()).equals(h3.values())));


System.out.println("===========================");
		ArrayList<String> s=new ArrayList<>();
		s.add("Snehal");
		s.add("Lisa");
		s.add("Tom");
		s.add("Jerry");
		
		Collections.sort(s);
		
		for (int i = 0; i < s.size(); i++) {
			System.out.println(s.get(i));
			
		}
	//	System.out.println(h1.equals(h3));
		
		
		
		
	     LinkedList<Integer> l1=new LinkedList<>();
	     l1.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7}));
	     
	     LinkedList<Integer> l2=new LinkedList<>();
	     l1.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7}));
	     
	    LinkedList<Integer> union=new LinkedList<>(l1);
	    union.addAll(l2);
	    
	    System.out.println(union);
	    
	    
	    HashSet<Integer> h11=new HashSet<>();
	    h11.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7}));
	    
	    HashSet< Integer> h12=new HashSet<>();
	    h12.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,9}));
	    
	    HashSet<Integer> uni=new HashSet<>(h11);
	    uni.addAll(h12);
	    System.out.println(uni);
	    
	

	}

}
