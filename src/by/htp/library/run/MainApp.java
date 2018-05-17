package by.htp.library.run;

import by.htp.library.entity.Author;
import by.htp.library.entity.Book;
import by.htp.library.entity.Library;
import by.htp.library.logic.Librarian;

public class MainApp {
public static void main(String[] args) {
		
		Author sheckspear = new Author("William", "Shakespear", 1986);
		Author tolstoy  = new Author("Lev", "Tolstoy", 1986);
		Author lev  = new Author("Lev", "Radin", 1986);
		Author jeremy  = new Author("Jeremy", "Mythbusters", 1986);
		Author jimmy  = new Author("Jimmy", "Mythbusters", 1986);
		
		Librarian librarian = new Librarian();
		
		Book bookAboutLove = new Book ("Romeo and Julliet", sheckspear, 1996);
		Book bookAboutWar = new Book ("War and Piece", tolstoy, 1945);
		Book bookAboutWomen = new Book ("Anna Karenina", tolstoy, 1948);
		Book bookAboutHamlet = new Book ("Hamlet", sheckspear, 1675);
		Book bookAboutSience = new Book("Mythbusters", jeremy, 1995);
		Book bookFake = new Book ("Fake", lev, 1996);
		
		Library library = new Library();
		
		library.addBook(bookAboutLove);
		library.addBook(bookAboutWar);
		library.addBook(bookAboutWomen);
		library.addBook(bookAboutHamlet);
		library.addBook(bookFake);
		library.addBook(bookAboutSience);	
		
		Library result = librarian.searchBookByAuthor(library, tolstoy);
		librarian.print(result);
		
		System.out.println("=========================");
		
		Library result1 = librarian.searchByAuthorTitleDate(library, sheckspear, "Romeo and Julliet", 1996);
		librarian.print(result1);
		
		System.out.println("=========================");
		
		Book resultBook = librarian.searchBook(library, bookFake);
		librarian.printBook(resultBook);
		
}

}
