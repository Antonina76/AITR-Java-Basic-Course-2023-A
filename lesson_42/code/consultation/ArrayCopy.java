package consultation;

import company_employes.practice.dao.model.SalesManager;
import practice41.album.dao.Album;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        //System.arrayCopy - test
        //заполним массив целыми числами 10,20,30 и т.д.
        int []arrayInt = new int[10];
        for (int i = 0; i < arrayInt.length; i++) {
           arrayInt[i]=(i + 1)*10;
        }
        System.out.println( Arrays.toString(arrayInt));
        //хотим вставить в массив новый элемент, например 15, сохранив порядок сортировки
        int index = Arrays.binarySearch(arrayInt,20);
        System.out.println(index);
        //обрабатываем индекс и копируем хвост массива  от элемента с этим индексом вправо на один элемент
        //вставляем новый элемент на освоб.место и печатаем новый массив
        index = index>=0 ? index : - index-1;
        //увеличиваем массив и копируем исходный в новый массив
        int []arrayIntCopy = new int[arrayInt.length+1];
        System.arraycopy(arrayInt,0,arrayIntCopy,0,arrayInt.length);
        System.out.println(Arrays.toString(arrayIntCopy));
        //копируем хвост массива
        System.arraycopy(arrayIntCopy,index,arrayIntCopy,index+1,arrayIntCopy.length-index-1);
        System.out.println(Arrays.toString(arrayIntCopy));
        arrayIntCopy [index] = 15;//вставляем элемент
        System.out.println(Arrays.toString(arrayIntCopy));
    }
}
