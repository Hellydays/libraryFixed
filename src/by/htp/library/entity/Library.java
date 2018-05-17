package by.htp.library.entity;

public class Library {
	
	private Book[] books;
	private int maxLength = 1;
	private int lastIndex = 0;
	
	public Library() {
		this.books = new Book[maxLength];
	}
	
	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}
	
	public void addBook (Book book) {
		if (lastIndex < maxLength) {
			books[lastIndex] = book;
			lastIndex++;
		} else if (lastIndex >= maxLength) {
			Book[] newBooks = new Book[lastIndex+1];
			for(int i = 0;i<books.length; i++) {
				newBooks[i] = books[i];
			}
			newBooks[lastIndex] = book;
			books = newBooks;
			lastIndex++;
			maxLength++;
		}
	}

}
