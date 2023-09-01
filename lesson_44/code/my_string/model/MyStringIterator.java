package my_string.model;

import java.util.Iterator;

public class MyStringIterator implements Iterator<Character> {
    //fields
    private StringBuilder str;
    private int size;
    private int currPosition;
    //constructor
    public MyStringIterator (StringBuilder str){
        this.str = str;
        size = str.length();
      //  currPosition = 0;
    }

    //проверяет, есть ли следующий
    @Override
    public boolean hasNext() {
        return currPosition < size;//логическое выражение,которое отражает логику наличия
    }

    //возвращает элемент
    @Override
    public Character next() {
        Character currCharacter = str.charAt(currPosition);
        currPosition++;
        return currCharacter;
    }
    public void remove(){
        str.deleteCharAt(--currPosition);
        size--;
    }
}
