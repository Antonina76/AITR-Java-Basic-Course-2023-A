package homework_1.book.controller;

import homework_1.book.model.Book;
import homework_1.book.model.Book;
import homework_1.book.model.Dictionary;

public class BookAppl {
    public static void main(String[] args) {
        //создаем объектные переменные book1, book2, book3.

        Book book1 = new Book("Heart of Dragon ", "Kirill Klevanskij", 2016,1000001);
        Book book2 = new Book("Code de Vinci","Den Brown ",2003,10000002);
        Book book3 = new Book("White klik"," Jack London ",1900,1000003);

        book1.display();
        book2.display();
        book3.display();
        System.out.println();
        book1.display1();
        book1.display1();
        book1.display1();

        Dictionary dictionary1 = new Dictionary("New dictionary","Zaharenko E.N.",1987,10000L,"Dictionary of foreign words");
        dictionary1.display();

    }
}
