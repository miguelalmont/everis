package operations;

import model.Book;

public class Helper {

	public static void increaseId(Book b, int idToIncrease) {
		b.setId(b.getId() + idToIncrease);
	}

	public static void decreaseId(Book b, int idToDecrease) {
		b.setId(b.getId() - idToDecrease);
	}

}
