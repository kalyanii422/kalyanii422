package tasksCoreJava;

import java.util.ArrayList;
import java.util.List;

public class DuplicateCharInString {

	public static void main(String[] args) {

		
		String str = "John depp pirates jealous";
		
		int count;
	    for(int i = 0; i < str.length(); i++) {
	      count = 1;
	      char c = str.charAt(i);
	      if(c == ' ') 
	        continue;
	      for(int j = i + 1; j < str.length(); j++) {
	        if(c == str.charAt(j)) {
	          count++;
	          str = str.substring(0, j) + str.substring(j+ 1);
	        }
	      }
	      if(count > 1) {
	        System.out.println(c + " : " + count );
	      }
	    }
	}

}
