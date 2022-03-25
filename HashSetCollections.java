package tasksCoreJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetCollections {

	public static void main(String[] args) {
	
		HashSet<String> setString = new HashSet<String>();
		
		setString.add(null);
		setString.add(null);
		setString.add("Books");
		setString.add("Movies");
		setString.add("Books");
		
		
		System.out.println("First set values : "+setString);
		
			
		Set<Integer> setInt = new HashSet<Integer>();
		setInt.add(3);
		setInt.add(5);
		setInt.add(7);
		setInt.add(11);
		System.out.println("First 4 prime set values : "+setInt);
		
		Set<Integer> setInt2 = new HashSet<Integer>();
		setInt2.add(13);
		setInt2.add(17);
		setInt2.add(19);
		setInt2.add(23);
		System.out.println("next 4 prime set values : "+setInt2);
		
		setInt.addAll(setInt2);
		//setInt.add(null);
		System.out.println("Total prime set values : "+setInt);
		
		
		List<Integer> listInt = new ArrayList<Integer>();
		listInt.add(3);
		listInt.add(7);
		listInt.add(13);
		
		setInt.remove(11);
		System.out.println("After remove -  set values : "+setInt);
		
		setInt.removeAll(listInt);
		System.out.println("After removing list -  set values : "+setInt);
		
		Iterator<Integer> iterator = setInt.iterator();
		
		System.out.println("while loop : ");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("for loop : ");
		for(int integer : setInt) {
			System.out.println(integer);
		}
		
		for(Iterator<Integer> loopCount = setInt.iterator(); loopCount.hasNext();) {
			System.out.println(loopCount.next());
		}
		
		setInt.stream().forEach(element -> System.out.println(element));
		
	}
	

}
