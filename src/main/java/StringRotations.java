package tasksCoreJava;

public class StringRotations {

	static boolean checkRotation(String s1, String s2) {

		if (s1.length() != s2.length())
			return false;
		String temp = s1 + s1;
		if (temp.indexOf(s2) != -1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		String a = "HELLO";
		String b = "LOHEL";
		if (checkRotation(a, b))
			System.out.println("Given Strings are rotations of each other.");
		else
			System.out.println("Given Strings are not rotations of each other.");
	}

}
