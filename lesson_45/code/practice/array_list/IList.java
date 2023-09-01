package practice.array_list;

public interface IList <E> extends Iterable<E>{
    //опишим методы, которые нам нужны для работы со "списком", куда могут попасть любые типы данных
    //int,double,boolean,Integer, Double, String, типы на основе классов Employee,Car,Pet,Photo,

    int size ();// метод отвечает за размер IList
    default boolean isEmpty(){//позволяет проверить лист пустой или нет
      return size() == 0;
    };
     void  clear();//удаляет все элементы
    boolean add(E element);//добавляет элемент
   default boolean contains (Object o){//есть ли такой элемент или нет в листе
     return indexOf(o) >= 0;
   };
    default boolean remove (Object o){ //удаление элемента из списка
       int index = indexOf(o);
       if(index<0){
           return false;//когда элемент не нашелся в списке
       }
       remove(index);
       return true;
    };
    boolean add(int index,E element);//вставка на место по индексу
    E get(int index);//получает элемент по индексу
    int indexOf (Object o);//узнать индекс элемента списка
    int lastIndexOf (Object o);//ищем индекс с конца списка в направление его начала
    E remove (int index);//удаляем по индексу
    E set(int index, E element);//update

}
