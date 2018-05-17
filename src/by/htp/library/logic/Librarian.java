package by.htp.library.logic;

import by.htp.library.entity.Author;
import by.htp.library.entity.Book;
import by.htp.library.entity.Library;

public class Librarian {

	public void print(Library library) {

		for (Book bookEach : library.getBooks()) {

			String authorName = bookEach.getAuthor().getName();
			String authorSurname = bookEach.getAuthor().getSurname();
			int dateOfAuthorsBirth = bookEach.getAuthor().getDateOfBirth();

			System.out.println("Book title: " + bookEach.getTitle() + " | Book publication: "
					+ bookEach.getDateOfPublication() + " | Author name: " + authorName + " | Author surname: "
					+ authorSurname + " | Author birth: " + dateOfAuthorsBirth);

		}
	}

	public void printBook(Book book) {

		String authorName = book.getAuthor().getName();
		String authorSurname = book.getAuthor().getSurname();
		int dateOfAuthorsBirth = book.getAuthor().getDateOfBirth();

		System.out.println("Book title: " + book.getTitle() + " | Book publication: " + book.getDateOfPublication()
				+ " | Author name: " + authorName + " | Author surname: " + authorSurname + " | Author birth: "
				+ dateOfAuthorsBirth);

	}

	public Library searchBookByAuthor(Library library, Author author) {

		int counter = 0;
		int idx = 0;

		for (Book bookEach : library.getBooks()) {
			if (bookEach.getAuthor().equals(author)) {
				counter++;
			}
		}

		Book[] newBooks = new Book[counter];

		for (Book bookEach : library.getBooks()) {
			if (bookEach.getAuthor().equals(author)) {
				newBooks[idx] = bookEach;
				idx++;
			}
		}

		Library libraryResult = new Library();
		libraryResult.setBooks(newBooks);

		return libraryResult;

	}

	public Book searchBook(Library library, Book book) {
		Book bookResult = new Book(null, null, 0);
		for (Book bookEach : library.getBooks()) {
			if (bookEach.equals(book)) {
				bookResult = bookEach;
			} 
		} return bookResult;
	}

	public Library searchByAuthorTitleDate(Library library, Author author, String title, int publicationYear) {

		int counter = 0;
		int idx = 0;

		for (Book bookEach : library.getBooks()) {
			if (bookEach.getAuthor().getName().equals(author.getName())
					&& bookEach.getAuthor().getSurname().equals(author.getSurname())
					&& bookEach.getAuthor().getDateOfBirth() == author.getDateOfBirth()
					&& title.equals(bookEach.getTitle()) && publicationYear == bookEach.getDateOfPublication()) {
				counter++;
			}
		}

		Book[] newBooks = new Book[counter];

		for (Book bookEach : library.getBooks()) {
			if (bookEach.getAuthor().getName().equals(author.getName())
					&& bookEach.getAuthor().getSurname().equals(author.getSurname())
					&& bookEach.getAuthor().getDateOfBirth() == author.getDateOfBirth()
					&& title.equals(bookEach.getTitle()) && publicationYear == bookEach.getDateOfPublication()) {
				newBooks[idx] = bookEach;
				idx++;
			}
		}

		if (newBooks.length == 0) {
			System.out.println("No results relevant to your criteria were found ");
		}

		Library libraryResult = new Library();
		libraryResult.setBooks(newBooks);
		return libraryResult;

	}

}
