package tasksCoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayListCollections {

	
	public static void main(String[] args) {
		
		Collection<String> colStr = new ArrayList<>();
		
		colStr.add("epam");
		colStr.add("Accenture");
		colStr.add("IBM");
		colStr.add("Oracle");
		colStr.add("TCS");
		colStr.add("Genpact");
		
		
		System.out.println("Array list values : "+colStr);
		
		String[] arrayList = new String[colStr.size()];
		
		arrayList = colStr.toArray(arrayList);
		
		System.out.print("Converted from Array List to Array : ");
		for(int loop=0;loop<arrayList.length;loop++) {
		
			System.out.print(arrayList[loop]+ "  ");
		}
		
		
		List<Integer> integer = new ArrayList<>();
		
		integer.add(1000);
		integer.add(2000);
		integer.add(3000);
		System.out.println();
		System.out.println("Array list integer values : "+integer);
		
		List<String> colStr1 = new ArrayList<String>();
		
		colStr1.add("Apple");
		colStr1.add("BlackBerry");
		colStr1.add("Canon");
		colStr1.add("Dell");
		colStr1.add("Elon");
		List<String> colStr2 = new ArrayList<String>(colStr1);
		
		List<String> colStr3 = new ArrayList<String>();
		colStr3.add("Jack");
		colStr3.add("Jhon wick");
		colStr3.add("triple");
		System.out.println(" ");
		System.out.println("Array list total values : "+colStr2);
		colStr2.addAll(colStr3);
		System.out.println(" ");
		System.out.println("Final Array list : "+colStr2);
		
		System.out.println("After Removing some data form Array List :  "+ colStr2.remove(1));
		System.out.println("Final Array list : "+colStr2);
		
		System.out.println("is Array List empty? : "+ colStr2.isEmpty());
		
		System.out.println("Second Element in the Array List : "+ colStr2.get(1));
		
		
		String[] newArray = {"Dell", "Acer", "Lenovo", "MacBook", "HP"};
		
		System.out.println(" ");
		System.out.println("Normal Array values : ");
		for(int i =0;i<newArray.length;i++) {
			System.out.println(newArray[i]);
		}
		
		List<String> arrayToList = new ArrayList<String>(Arrays.asList(newArray));
		
		System.out.println("Converted from Array values to Array List : "+arrayToList);
		
		System.out.println("Loop iterator test");
		Iterator<String> iterator = arrayToList.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		arrayToList.add(null);
		arrayToList.add(null);
		
		
		System.out.println("for each :");
		arrayToList.stream().forEach(element -> System.out.println(element));
		arrayToList.forEach(element -> System.out.println(element));
		
		
	}

}
