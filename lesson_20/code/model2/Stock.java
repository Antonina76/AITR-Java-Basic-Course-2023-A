package model2;

import library.model.Book;

public class Stock {
    private Computer[] computers;// массив, куда будут попадать все компьютеры на складе
    private  int size;//количество компьютеров на складе

   //метод класса, который задает размер склада, т.е. длину массива computers
    public  Stock (int capacity ){computers = new Computer[capacity]; }
    //добавление компьютера
    public boolean addComp (Computer computer){
        if ((size == computers.length)|| findComp(computer.getBarcode())!= null){
            return false;//не можем добавить компьютер, т.к. нет места или такой компьютер уже есть
        }
        computers [size] = computer;//помещаем книгу в массив
        size++;
        return true;
    }

    //метод поиска книги по barcode
    public Computer findComp (long barcode){
        for (int i = 0; i < size; i++) {//пробегаем по массиву
            if (computers[i].getBarcode() == barcode){//проверяем совпадения barcode
                return computers[i];//возвращаем элемени массива типа Book
            }
        }
        return null;
    }

    public Computer findCompBrand (String brand) {
        for (int i = 0; i < size; i++) { // пробегаем по массиву
            if (brand.equals(computers[i].getBrand())) { // проверяем совпадение строк в поле brand
                return computers[i]; // возвращаем элемент массива типа Computer
            }
        }
        return null;
    }
    public Computer removeComp (long barcode, Computer[] computers){
        Computer victim = null;
        for (int i = 0; i < size; i++) {
            if(computers[i].getBarcode() == barcode){
                victim = computers[i];
                computers[i] = computers[size - 1]; // на место удаляемого  ставим последний компьютер
                computers[size - 1] = null; // последний компьютер стираем, тк он теперь стоит на месте удаленного
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
