package tasksCoreJava;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {

	public static void main(String[] args) {

		
		Hashtable<Integer,String>  city = new Hashtable<Integer,String>();  
		  
		city.put(100,"Hyderabad");  
		city.put(102,"Chennai");  
		city.put(101,"Bangalore");  
		city.put(103,"Pune");  
		  
		  for(Map.Entry m:city.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 
	}  
		
	

}
