package my_string;

import my_string.model.MyStringIterator;

import java.util.Iterator;

public class MyString implements Iterable<Character>{

  //fields
   private StringBuilder str;// StringBuilder это встроенныый в Джава класс

    //constructor

    public MyString (String str){
        this.str = new StringBuilder(str);
    }
   //getter and setter
//убираем доступ к полю элемента класса
 //   public StringBuilder getStr() {
//        return str;
 //   }

    public void setStr(StringBuilder str) {
        this.str = str;
    }
    public void addChar (char c){
        str.append(c);
    }
    public void removeChar (char c){
        int index = str.indexOf(Character.toString(c) );//нашли индекс С
        str.deleteCharAt(index);
    }
    public String toString (){
        return str.toString();
    }
    //метод, который возвращает объект типа Iterator
    @Override
    public Iterator<Character> iterator() {
        return new MyStringIterator(str);
    }
}
