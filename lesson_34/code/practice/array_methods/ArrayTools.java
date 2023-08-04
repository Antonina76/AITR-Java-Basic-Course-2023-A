package practice.array_methods;

import java.util.Comparator;
import java.util.function.Predicate;

public class ArrayTools {

//печать массива

public static void printArray(Object[]arr){
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
    System.out.println("==============");
}
//search поиск объекта в массиве объекта
public static int searchIndex(Object[]arr,Object value){
    for (int i = 0; i < arr.length; i++) {
        if(arr[i].equals(value)) {
            return i;
        }
    }
    return -1;//не существующий индекс
    }



    public static boolean searchBoolean(Object[]arr,Object value){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(value)) {
                return true;
            }
        }
        return false;
    }
    //поиск объектов по условию
    public static <T>T findByPredicate (T[]arr, Predicate<T>predicate){
    //метод возвращает тип данных Т из массива объектов типа Т и осуществляет отбор по Predicate
        for (int i = 0; i < arr.length; i++) {
            if(predicate.test(arr[i])){//встроенный метод в Predicate возвращает boolean
                return arr[i];
            }
        }
        return null;


    }

    //bubbleSort
    public static  <T extends Comparable<T>> void bubbleSort (T[]arr) {
        //этот метод применим к типам (классам), в которых есть Comparable<T>
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {//result is greater than zero
                    //перестановка элемента массива местами  Array element rearrangement
                    T t = arr[j];//уберегли j елемент от заперания, убрав его во временную переменную
                    arr[j] = arr[j + 1];//следующий элемент (j+1)перенесли в j
                    arr[j + 1] = t; //в j+1 поставили t
                }
            }

        }

    }


  //bubbleSort by Comparator
    public static <T> void bubbleSort (T[]arr, Comparator<T>comparator) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
             if(comparator.compare(arr[j],arr[j+1])>0){
                 T t = arr[j];
                 arr[j]=arr[j+1];
                 arr [j+1] = t;
             }

            }

        }
    }
}

