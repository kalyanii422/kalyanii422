package tasksCoreJava;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListCollections {

	public static void main(String[] args) {

		
		LinkedList<String> linkedlist = new LinkedList<String>();
		
		linkedlist.add("Thus Spoke Zarathustra");
		linkedlist.add("Beyond Good and Evil");
		linkedlist.add("The Fountainhead");
		linkedlist.add("You can win");
		linkedlist.add("The monk who sold his Ferrari");
		linkedlist.add("As Man Thinken");
		
		System.out.println("List of Books :"+linkedlist);
		
		linkedlist.add(3, "Attitude is everything");
		System.out.println("After adding in middle position - List of Books :"+linkedlist);
		
		linkedlist.addFirst("Intelligent Investor");
		
		System.out.println("After adding first position - List of Books :"+linkedlist);
		
		linkedlist.addLast("The Richest man in babylon");
		
		System.out.println("After adding last position - List of Books :"+linkedlist);
		
		
		Iterator<String> iterator = linkedlist.iterator();
		
		System.out.println("Iterator loop for linkedlist");
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		System.out.println("To fetch First element - "+linkedlist.getFirst());
		System.out.println("To fetch Last element - "+linkedlist.getLast());
		System.out.println("To fetch second position element - "+linkedlist.get(1));
		System.out.println("To fetch index of element - "+linkedlist.indexOf("You can win"));
		System.out.println("To Remove First element - "+linkedlist.remove());
		System.out.println("After removed - List of Books :"+linkedlist);
	
		System.out.println("Searching element - List of Books : "+linkedlist.contains("Intelligent Investor"));
	
		linkedlist.add(null);
		linkedlist.add(null);
		linkedlist.add(null);
		
		
		linkedlist.stream().forEach(element -> System.out.println(element));
		linkedlist.forEach(element -> System.out.println(element));
		
		
		LinkedList<String> bookList = new LinkedList<String>();
		
		bookList.add("Thus Spoke Zarathustra");
		bookList.add("Beyond Good and Evil");
		bookList.add("The Fountainhead");
		bookList.add("You can win");
		bookList.add("The monk who sold his Ferrari");
		bookList.add("As Man Thinken");
		
		
		System.out.println("Books available : "+bookList);
		
		
		ListIterator bookIterator = bookList.listIterator();
		
		while(bookIterator.hasNext()) {
			System.out.println(bookIterator.next());
		}
		
		String[] bookArray = new String[bookList.size()];
		bookArray = bookList.toArray(bookArray);
		
		System.out.println("List to array converted : ");
		for(String str : bookArray) {
			System.out.println(str);
			
		}
	}

}
