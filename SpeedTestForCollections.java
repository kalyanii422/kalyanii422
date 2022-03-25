package tasksCoreJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SpeedTestForCollections {
	
	
	

	public static void main(String[] args) {
		
		List<Integer> intArrayList = new ArrayList<Integer>();
		
		for(int i =0; i <=20000; i++) {
			intArrayList.add(i);
		}
		
		//intArrayList.forEach(element -> System.out.println(element));
    	
		
		
    	LinkedList<Integer> linkedlist = new LinkedList<Integer>();
    	
//    	linkedlist.add(2);
//    	linkedlist.add(3);
//    	linkedlist.add(4);
//    	linkedlist.add(5);
    	
    	for(int i =0; i<200023;i++) {
    		linkedlist.add(i);
    	}
    	
    	//linkedlist.forEach(element -> System.out.println(element));
    	
    	
    	Set<Integer> intSet = new HashSet<Integer>();
    	
    	//Math.random()*(max-min+1)+min;
    	
    	for(int i =0; i<100023;i++) {
    		intSet.add(i);
    	}
    	
    	//intSet.forEach(element -> System.out.println(element));
    	
    	
    	Set<Integer> intTreeSet = new TreeSet<Integer>();
    	for(int i =0; i<10000;i++) {
    		intTreeSet.add(i);
    	}
    	//intTreeSet.forEach(element -> System.out.println(element));
    	
    	
    	HashMap<Integer, String> hMap = new HashMap<Integer, String>();
    	
    	TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
    	
    	
    	System.out.println("Speed validation:");
    	
    	//intArrayList , linkedlist,  intSet,  intTreeSet
    	
    	long arrayTime = System.currentTimeMillis();
    	System.out.println("time  : "+System.currentTimeMillis());
    	intArrayList.add(14999,12345);
    	
    	System.out.println("time for insertion ArrayList: "+(System.currentTimeMillis()-arrayTime));
    	
    	long getArrayTime = System.currentTimeMillis();
    	intArrayList.get(18777);
    	System.out.println("time for retrieve ArrayList: "+(System.currentTimeMillis()-getArrayTime));
    	
    	long deleteArrayTime = System.currentTimeMillis();
    	intArrayList.remove(6008);
    	System.out.println("time for delete ArrayList: "+(System.currentTimeMillis()-deleteArrayTime));
    	
    	long ListTime = System.currentTimeMillis();
    	System.out.println("time  : "+System.currentTimeMillis());
    	linkedlist.add(14999,12345);
    	System.out.println("time for insertion LinkedList: "+(System.currentTimeMillis()-arrayTime));
    	
    	long getListTime = System.currentTimeMillis();
    	linkedlist.get(19943);
    	System.out.println("time for retrieve LinkedList: "+(System.currentTimeMillis()-getListTime));
    	
    	long deleteLinkedTime = System.currentTimeMillis();
    	linkedlist.remove(6008);
    	System.out.println("time for delete ArrayList: "+(System.currentTimeMillis()-deleteLinkedTime));
    	
    	
    	
    	
    	long setTime = System.currentTimeMillis();
    	System.out.println("time  : "+System.currentTimeMillis());
    	intSet.add(12345);
    	
    	System.out.println("time for insertion ArrayList: "+(System.currentTimeMillis()-setTime));
    	
    	
    	long deleteSetTime = System.currentTimeMillis();
    	intSet.remove(3456);
    	System.out.println("time for delete ArrayList: "+(System.currentTimeMillis()-deleteSetTime));
    	
    	long treeSetTime = System.currentTimeMillis();
    	System.out.println("time  : "+System.currentTimeMillis());
    	intTreeSet.add(234567);
    	System.out.println("time for insertion TreeSet: "+(System.currentTimeMillis()-treeSetTime));
    	
    	
    	long deleteTreeSetTime = System.currentTimeMillis();
    	intTreeSet.remove(6008);
    	System.out.println("time for delete TreeSet: "+(System.currentTimeMillis()-deleteTreeSetTime));
    	
    	
    	
    	
    	
	}

}
