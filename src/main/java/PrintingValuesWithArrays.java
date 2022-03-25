package tasksCoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintingValuesWithArrays {
	
	
	 public void printArray(String strArray){
		 
		 List<String> list = new ArrayList<String>(Arrays.asList(strArray.split(",")));
		 
		 list.forEach(element -> System.out.print(element));
		  
		 }

	public static void main(String[] args) {

		
		PrintingValuesWithArrays arr = new PrintingValuesWithArrays();
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Array integerArray contains:");
        arr.printArray(Arrays.toString(integerArray));
        System.out.println("\nArray doubleArray contains:");
        arr.printArray(Arrays.toString(doubleArray)); 
        System.out.println("\nArray characterArray contains:");
        arr.printArray(Arrays.toString(characterArray));

        
	}

}
