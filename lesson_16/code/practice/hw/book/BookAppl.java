package practice.hw.book;
import practice.hw.book.Book;

public class BookAppl {
    public static void main(String[] args) {
        //создаем объектные переменные book1, book2, book3.
        Book book1 = new Book(2003L,"The God of small things",1997);
        System.out.println((book1.getIsbn() +"," + book1.getTitle() + "," + book1.getYearOfPublishing()));
        System.out.println();
        book1.display();
        System.out.println();
        Book book1_1 = new Book(2003l,"The God of small things", "Arundhati Roi",1997);
        book1_1.display1();
        System.out.println();
        Book book2 = new Book(2004L,"My life.My faith.","Mahatma Karamchand Gandi ",1925);
        book2.display1();
        System.out.println();
        book2.display();

    }

}


