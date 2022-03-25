package tasksCoreJava;

import java.util.ArrayList;
import java.util.List;

public class CustomExceptions {

	public void getBookAvailablity(String book) throws Exception {
		List<String> bookNames = new ArrayList<>();

		bookNames.add("Thus spoke Zarathustra");
		bookNames.add("Behind Good and Evil");
		bookNames.add("The Fountainhead");
		bookNames.add("Atlus Shrugged");

		if (bookNames.contains(book)) {
			System.out.println(book + " book is available right now!");
		} else {
			throw new BookStoreExceptions(
					" *** You're searching for " + book + "!!, but its not available right now. go for another store. ***");
		}
	}

	public static void main(String[] args) throws Exception {
		CustomExceptions user = new CustomExceptions();

		user.getBookAvailablity("Men are from mars and women are from venus");

		//user.getBookAvailablity("Atlus Shrugged2");
	}

}

class BookStoreExceptions extends Exception {

	public BookStoreExceptions(String message) {
		super(message);
	}

}
