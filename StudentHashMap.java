package tasksCoreJava;

import java.util.HashMap;

public class StudentHashMap {

	public String getStudent(int key) {
		
		HashMap<Integer, String> student = new HashMap<Integer, String>();
		
		student.put(11, "John");
		student.put(22, "depp");
		student.put(33, "Bean");

		return student.get(key);
	}
	
	public static void main(String[] args) {
		
		StudentHashMap studentDetails = new StudentHashMap();
		
		System.out.println("Name of the student : "+studentDetails.getStudent(33));

	}

}
