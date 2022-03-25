package tasksCoreJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapCollections {

	public static void main(String[] args) {

		Map<Integer, String> books = new HashMap<Integer, String>();
		
		books.put(1, "The Fountainhead");
		books.put(2, "Beyond Good and Evil");
		
		books.put(5, "You can win");
		books.put(3, "The monk who sold his Ferrari");
		books.put(6, "Thus Spoke Zarathustra");
	
		books.put(4, "As Man Thinken");
		books.put(null, "Thus Spoke Zarathustra");
		
		System.out.println(books);
		
		System.out.println("is Books shelf is empty? : " +books.isEmpty());
		
		System.out.println("The book Shelf size? : " +books.size());
		
		if(books.containsKey(4)) {
			System.out.println("Book is available in shelf");
		}else {
			System.out.println("Need to buy the required book");
		}
		
		if(books.containsValue("The Richest Man in Babylon")) {
			System.out.println("Book is available in shelf");
		}else {
			System.out.println("Need to buy the required book");
		}
		
		System.out.println("To fetch the book : "+ books.get(4));
		System.out.println("To fetch the Keys : "+ books.keySet());
		System.out.println("To fetch the values : "+ books.values());
		
		for(Map.Entry<Integer, String> entryBook : books.entrySet()) {
			System.out.println("Key : "+ entryBook.getKey() +" and "+ "Value :"+ entryBook.getValue());
		}
		
		Set<Map.Entry<Integer, String>> setIntIterator = books.entrySet();
		
		Iterator<Map.Entry<Integer, String>> iterator = setIntIterator.iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer, String> book = iterator.next();
			System.out.println("Key : "+book.getKey()+" and "+" value : "+ book.getValue());
		}
		
		books.forEach((k, v) -> {
			System.out.println("Key : "+ k);
			System.out.println("Value : "+ v);
			
		});
		
		
		System.out.println("\n Tree Map Examples :\n");
		
		TreeMap<Integer, String> bookTree = new TreeMap<Integer, String>();
		
		bookTree.put(1, "The Fountainhead");
		
		bookTree.put(5, "You can win");
		bookTree.put(6, "Thus Spoke Zarathustra");
		bookTree.put(3, "The monk who sold his Ferrari");
		bookTree.put(6, "Thus Spoke Zarathustra");
		bookTree.put(2, "Beyond Good and Evil");
		
		bookTree.put(4, "As Man Thinken");
		//bookTree.put(null, "Thus Spoke Zarathustra");
		
		System.out.println("Tree Map with normal - "+bookTree);
		
		System.out.println("Tree MAp with entrySet - " + bookTree.entrySet());
		
		System.out.println("Tree Map with Keys - "+bookTree.keySet());
		
		System.out.println("Tree Map with values - "+bookTree.values());
		
		
		
		
	}

}
