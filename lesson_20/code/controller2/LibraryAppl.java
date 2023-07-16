package controller2;

import library.model.Book;
import library.model.Library;

import java.sql.SQLOutput;

public class LibraryAppl {
    public static void main(String[] args) {
        Library library = new Library(1000);
        library.addBook(new Book("War and Peace ","Tolstoj ",1990,1234567890123L));
        library.addBook(new Book("Anna Korenina ","Tolstoj ",1995,1234567890124L));
        library.addBook(new Book("Oruell ","Tolstoj ",1985,1234567890125L));
        System.out.println(library.getSize());
      //  Book bookFind = library.findBook(1234567890124L);
       // System.out.println(bookFind);
       // System.out.println(library.findBook(1234567890124L));
        System.out.println(library.findBookTitle("Oruell "));
        System.out.println(library.findBook(1234567890123L));
      //  System.out.println(library.findBookAuthor("Tolstoj",));
    }
}
