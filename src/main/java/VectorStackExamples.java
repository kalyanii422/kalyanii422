package tasksCoreJava;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class VectorStackExamples {

	public static void main(String[] args) {

		
		Vector<Integer> v = new Vector<Integer>();
        
        // Adding elements to the vector object
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
          
        System.out.println("Enumeration: ");
          
        // Creating an Enumeration object
        Enumeration e = v.elements();
          
        // Checking the next element availability
        while (e.hasMoreElements()) {
              
            // Moving cursor to the next element
            int i = (Integer)e.nextElement();
              
            // Printing the element
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
          
        System.out.println("Iterator: ");
          
        // Creating Iterator object
        Iterator<Integer> itr = v.iterator();
          
        // Checking the next element availability
        while (itr.hasNext()) {
              
            // Moving cursor to the next element
            int i = (Integer)itr.next();
              
            // Checking if i == 10 then
            // remove the element
            if (i == 10)
                itr.remove();
        }
        System.out.println(v);
        System.out.println();
          
        System.out.println("ListIterator: ");
          
        // Creating ListIterator object
        ListIterator<Integer> ltr = v.listIterator();
          
        // Checking the next element availability
        while (ltr.hasNext()) {
              
            // Moving cursor to the next element
            int i = (Integer)ltr.next();
              
            // Performing add, remove, and 
            // replace operation
            if (i == 20)
                ltr.remove();
              
            else if (i == 30)
                ltr.add(60);
              
            else if (i == 40)
                ltr.set(100);
        }
          
        System.out.println(v);
		
		
        Stack<String> stackStr = new Stack<String>();
        
        stackStr.addElement("As Man Thinken");
        stackStr.add("The Fountainhead");
        //stackStr.addElement("As Man Thinken");
        stackStr.add("Thus Spoke Zarathustra");
        stackStr.add("The Richest man in Babylon");
        stackStr.add("Rich Dad and Poor Dad");
        
        //System.out.println(enumObj.nextElement());
        Enumeration enumObj = stackStr.elements();
        
        
        System.out.println("Stack elements using Enumeration :");
        while(enumObj.hasMoreElements()) {
        	System.out.println(enumObj.nextElement());
        }
		
        stackStr.addElement("New Book");
        stackStr.forEach(Element -> System.out.println(Element));
        

        
        
	}

}
