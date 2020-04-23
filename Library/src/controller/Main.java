package controller;

import java.util.HashMap;
import java.util.Map;

import model.Book;
import operations.Helper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("Michael Ende", "La Historia Interminable", 1979);
		Book b2 = new Book("George Orwell", "1984", 1949);
		Book b3 = new Book("Phillip K. Dick", "Sue�an los androides con ovejas electricas", 1968);

		Map<Integer, Book> bookMap = new HashMap<>();

		bookMap.put(b1.getId(), b1);
		bookMap.put(b2.getId(), b2);
		bookMap.put(b3.getId(), b3);

		for (Book b : bookMap.values()) {
			Helper.increaseId(b, 1000);
			System.out.println(b);
		}
	}

}
