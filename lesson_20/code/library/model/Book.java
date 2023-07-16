package library.model;

import java.util.Objects;

public class Book {
  private String title;
  private String author;
  int yearOfPublishing;
  public static final int ISBN_LENGTH = 13;//никто не может поменять длину этого значения
  private final long isbn;//почему final?

//designer full
    public Book(String title, String author, int yearOfPublishing, long isbn) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.isbn = checkIsbn(isbn);//проверка isbn
    }
//designer without author

    public Book(String title, int yearOfPublishing, long isbn) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.isbn = checkIsbn(isbn);
        author = "unknown";
    }
    //getter and setter


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public long getIsbn() {
        return isbn;
    }

    private long checkIsbn (long isbn){
       if (countDigits(isbn) == ISBN_LENGTH) {//проверка, что 13 чисел в isbn
           return  isbn;
       }
       return -1;
    }

    @Override
    public String toString() {
        return "Book: " +
                "title: " + title + '\'' +
                ", author: " + author + '\'' +
                ", yearOfPublishing:" + yearOfPublishing +
                ", isbn: " + isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn == book.isbn;//это позволит быстро искать книгу
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearOfPublishing, isbn);
    }

    //метод, который считает цифры в isbn
    private int countDigits  ( long isbn){
        int count = 0;
        do {
           count ++;//счетчик количества цифр
           isbn /= 10;//делим число на 10

        } while (isbn!=0);
        return count;
    }
}
