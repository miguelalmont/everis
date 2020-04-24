package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import model.Book;
import operations.Helper;

public class HelperTest {

	@Test
	void testIncreaseId() {
		Book b1 = new Book("Michael Ende", "La Historia Interminable", 1979);
		Helper.increaseId(b1, 1000);
		assertEquals(1001, b1.getId());
	}
	
	@Test
	void testDecreaseId() {
		Book b1 = new Book("Michael Ende", "La Historia Interminable", 1979);
		Helper.decreaseId(b1, 1);
		assertEquals(0, b1.getId());

	}
}
