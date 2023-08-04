package practice1.array_methods;

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
            if(predicate.test(arr[i])){
                return arr[i];
            }
        }
        return null;
    }


}


