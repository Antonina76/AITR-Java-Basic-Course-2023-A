package homework_1.book.model;

public class Dictionary extends Book {
    String type;

    //designer



    public Dictionary(String title, String author, int year, long isbn) {
        super(title, author, year, isbn);
    }

    public Dictionary(String title, String author, int year, long isbn, String type) {
        super(title, author, year, isbn);
        this.type = type;
    }


    //getter and setter


    //_____Method________
    public void display() {
        super.display();
        System.out.println("type is: " + type);

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}