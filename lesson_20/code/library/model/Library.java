package library.model;
//добавление, удаление, поиск книги
public class Library {
    private Book [] books;// массив типа Book,туда попадут все книги в библиотеке
    private int size; //количество книг в библиотеке

    //метод класса, который задает размер библиотеки, т.е. длину массива books
    public Library (int capacity){
        books = new Book[capacity];
    }
    //добавление книги
    public boolean addBook (Book book){
        if ((size == books.length)|| findBook(book.getIsbn())!= null){
    return false;//не можем добавить книгу, т.к. нет места или такая книга уже есть
        }
        books [size] = book;//помещаем книгу в массив
        size++;
        return true;
    }
    //метод поиска книги по isbn
    public Book findBook (long isbn){
        for (int i = 0; i < size; i++) {//пробегаем по массиву
            if (books[i].getIsbn() == isbn){//проверяем совпадения isbn
                return books[i];//возвращаем элемени массива типа Book
            }
        }
        return null;
    }
    public Book findBookTitle (String title) {
        for (int i = 0; i < size; i++) { // пробегаем по массиву
            if (title.equals(books[i].getTitle())) { // проверяем совпадение строк в поле author
                return books[i]; // возвращаем элемент массива типа Book
            }
        }
        return null;
    }
    //нахождение по автору (если есть несколько разных книг в наличии одного автора)
    public Book[] findBookAuthor (String author, Book[] books) {
        //count how many books of author
        int count = 0;
        for (int i = 0; i < books.length; i++) { // пробегаем по массиву
            if (author.equals(books[i].getAuthor())) { // проверяем совпадение строк в поле author
                count++; // возвращаем элемент массива типа Book
            }
        }
        System.out.println("Number of books: " + count);
        //заполним массив с результатами поиска
        Book[] booksf = new Book[count]; // определил массив размером по кол-ву найденных
        count = 0;
        for (int i = 0; i < books.length; i++) {
            if (author.equals(books[i].getAuthor())) { // проверяем совпадение строк в поле author
                booksf[count] = books[i]; // заполняем массив booksf
                count++;
            }
        }
        return booksf;
    }
    //Удаление книги
    public Book removeBook(long isbn, Book[] books ){
        Book victim = null;
        for (int i = 0; i < size; i++) {
            if(books[i].getIsbn() == isbn){
                victim = books[i];
                books[i] = books[size - 1]; // на место удаляемой ставим последнюю книжку
                books[size - 1] = null; // последнюю книгу стираем, тк она теперь стоит на месте удаленной
                size--;
                break;
            }
        }
        return victim;
    }




    public int getSize (){
        return size;
    }


}
