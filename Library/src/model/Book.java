package model;

public class Book {

	private String author, title;
	private int id, publicationYear;
	private static int StaticId = 1;

	public Book() {

	}

	public Book(String author, String title, int publicationYear) {
		this.author = author;
		this.title = title;
		this.id = StaticId++;
		this.publicationYear = publicationYear;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publicationYear=" + publicationYear
				+ "]";
	}

}
