package practice;

import practice.model.Computer;

import java.util.Objects;
import java.util.concurrent.Callable;

public class ComputerCompareAppl {
    public static void main(String[] args) {
        Computer comp1 = new Computer("i5", 8,256,"lENOVO");
        Computer comp2 = new Computer("i5",8,256,"Lenovo");
        Computer comp3 = new Computer("i5",8,256,"Asus");
        Computer comp4 = new Computer("i5",8,512,"MacBookPro");
        Computer comp5 = new Computer("i5",8,256,"HP");

        System.out.println(comp1 == comp2);
        System.out.println(comp1.equals(comp2));
        System.out.println(comp1.equals(comp3));
        //создали массив компьютеров

        Computer []arrOfComp = new Computer[5];
        arrOfComp [0] = comp1;
        arrOfComp [1] = comp2;
        arrOfComp [2] = comp3;
        arrOfComp [3] = comp4;
        arrOfComp [4] = comp5;
        printArray(arrOfComp);//печатаем массив объектов
        int sum = 0;
        for (int i = 0; i < arrOfComp.length; i++) {
            sum = sum + arrOfComp[i].getSsd();

        }
        System.out.println("The total ssd memory: " + sum);

    }


        //____Methods_____

    //печать массива
    public static void  printArray(Object[]arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i].toString());
        }
    }
}

