package tasksCoreJava;

import java.util.*;


public class MapSetTreeSet {

	public static void main(String[] args) {

		//HashMap<Integer, String> map = new HashMap<>();
		
		//Map<Integer, String> map3 = new LinkedHashMap<Integer, String>();
		
	
		Map<Integer, String> treeMap = new TreeMap<>();
			
		treeMap.put(1, "The Fountainhead");
		treeMap.put(2, "Beyond Good and Evil");
		treeMap.put(6, "Thus Spoke Zarathustra");
		treeMap.put(5, "You can win");
		treeMap.put(3, "The monk who sold his Ferrari");
		treeMap.put(4, "As Man Thinken");
		//treeMap.put(null, "Thus Spoke Zarathustra");
		
		System.out.println(treeMap);
		
		System.out.println("is Books shelf is empty? : " +treeMap.isEmpty());
		
		System.out.println("The book Shelf size? : " +treeMap.size());
		
		if(treeMap.containsKey(6)) {
			System.out.println("Book is available in shelf : " + treeMap.get(6));
		}else {
			System.out.println("Invalid key number, you may add extra keys to this TreeMap");
		}
		
		System.out.println("Deleting one book from shelf : "+treeMap.get(3)+" option : "+treeMap.remove(3));
		
		System.out.println("The book Shelf size? : " +treeMap.size());
		treeMap.forEach((k, v) -> {
			System.out.println("Key : "+ k);
			System.out.println("Value : "+ v);
			
		});
		
		System.out.println("------------------------------------");
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "The Fountainhead");
		hashMap.put(2, "Beyond Good and Evil");
		hashMap.put(6, "Thus Spoke Zarathustra");
		hashMap.put(5, "You can win");
		hashMap.put(3, "The monk who sold his Ferrari");
		hashMap.put(4, "As Man Thinken");
		hashMap.put(null, "Thus Spoke Zarathustra");
		
		System.out.println(hashMap);
		
		System.out.println("Deleting one book from shelf : "+hashMap.remove(3));
		System.out.println("The book Shelf size? : " +treeMap.size());
		
		treeMap.forEach((k, v) -> {
			System.out.println("Key : "+ k);
			System.out.println("Value : "+ v);
			
		});
		
		System.out.println("----------------------------------------------------");
		
		
		
		
		Set<String> linkedSet = new LinkedHashSet<String>();
		linkedSet.add("You can win");
		linkedSet.add("Beyond Good and Evil");
		linkedSet.add("Thus Spoke Zarathustra");
		linkedSet.add("The Fountainhead");
		linkedSet.add("As Man Thinken");
		linkedSet.add("The Fountainhead");
		linkedSet.add(null);
		linkedSet.add(null);
		
		System.out.println("Tree Set values : "+ linkedSet);
		
		
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("You can win");
		treeSet.add("Beyond Good and Evil");
		treeSet.add("Thus Spoke Zarathustra");
		treeSet.add("The Fountainhead");
		treeSet.add("As Man Thinken");
		treeSet.add("The Fountainhead");
		//treeSet.add(null);
		
		System.out.println("Tree Set values : "+ treeSet);
		
		Iterator<String> iterator = treeSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		List<String> list = new LinkedList<String>();
		list.add("You can win");
		list.add("Beyond Good and Evil");
		list.add("Thus Spoke Zarathustra");
		list.add("The Fountainhead");
//		arrayLIst.add(null);
//		arrayLIst.add(null);
		list.add("As Man Thinken");
		list.add("The Fountainhead");
		
		System.out.println("before list iterator : normal order ");
		list.forEach(book -> System.out.println(book));
		
		ListIterator<String> listLiterator = list.listIterator(list.size());
		System.out.println("List iterator : reverse order");
		//System.out.println("List iterator value :" + listLiterator.hasPrevious());
		while(listLiterator.hasPrevious()) {
			System.out.println(listLiterator.previous());
		}
		
		
		
		
	
	}

}
