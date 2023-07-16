package practice.hw.book;
//Создать класс Book в пакете xxx.book.model. В этом классе определить поля:
// private long isbn; private String title; private String author; private int yearOfPublishing;
// Создать конструкторы для иницализации всех полей, и конструктор для инициализации полей при отсутствии автора.
// Остальные конструкторы на Ваше усмотрение. Создать геттеры и сеттеры, исходя из логики и необходимости.
// Создать метод public void display() для печати в консоль информации о книге.
//Создать класс BookAppl в пакете xxx.book с методом main. В методе main создать несколько экземпляров
// Book и вывести для каждого из них результат работы метода display.
public class Book {
    //поля класса Book
    private long isbn; //ISBN - уникальный номер
   private String title; //название - title
    private String author;//автор - author
   private int yearOfPublishing; //год -year

    //методы класса Book
    //конструктор


    public Book(long isbn, String title, String author, int yearOfPublishing) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public Book(long isbn, String title, int yearOfPublishing) {
        this.isbn = isbn;
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
    }

    public void display (){
            System.out.println("Title: "+ title);
            System.out.println("Year: "+ yearOfPublishing);
            System.out.println("ISBN: "+ isbn);

        }
    public void display1(){
        System.out.print("ISBN: "+ isbn + ".");
        System.out.print("Title: "+ title + ",");
        System.out.print("Author: "+ author + ",");
        System.out.print("Year: "+ yearOfPublishing +"," );

    }

    //  геттеры и сеттеры


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

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
}
