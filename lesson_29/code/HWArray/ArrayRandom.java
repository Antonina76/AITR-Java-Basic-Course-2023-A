package HWArray;

import java.util.Scanner;

public class ArrayRandom {
    public static void main(String[] args) {

        // Задача 2. Поиск дубликатов в массиве.
        // Задумайте массив из 100 элементов и заполните его случайными
        // значениями целых чисел в интервале от 1 до 10.
        // Подсчитайте сколько и каких элементов встретилось более одного раза в этом массиве.
        // Алгоритм:
        // Вар. 1 switch case по числам от 1 до 10. В каждом кейсе смотрим, сколько раз данное число попало в массив.
        // Вар. 2 внешний цикл запустить по числам от 1 до 10 и для каждого числа внутренним циклом посчитать, сколько раз
        // оно встретилось в массиве.
        // Вар 3. Объявить 10 счетчиков и для каждого из них в цикле понять, сколько раз число встерчалось в массиве.
        // Вар 4. Заполнить 2-х мерный массив x[][] - это на будущее.
        int[] num = new int[100];
        int a = 1, b = 10;
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * (b - a + 1) + a);//заполним элементы массива случайными натуральными числами
        }
        printArray(num);//вызываем метод и печатаем массив
        System.out.println();

            int count1= 0;
            for (int i = 0; i < num.length; i++) {
                if (num[i] == 1) {
                    count1 ++;
                }
            }
        System.out.println(count1);

            int count2 = 0;
            for (int i = 0; i < num.length; i++) {
            if (num[i] == 2) {
                count2 ++;
            }
        }
        System.out.println(count2);

            int count3 = 0;
            for (int i = 0; i < num.length; i++) {
                if (num[i] == 3) {
                    count3 ++;
                }
            }
        System.out.println(count3);

        int count4 = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 4) {
                count4 ++;
            }
        }
        System.out.println(count4);

        int count5 = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 5) {
                count5 ++;
            }
        }
        System.out.println(count5);

        int count6 = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 6) {
                count6 ++;
            }
        }
        System.out.println(count6);

        int count7 = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 7) {
                count7 ++;
            }
        }
        System.out.println(count7);

        int count8 = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 8) {
                count8 ++;
            }
        }
        System.out.println(count8);

        int count9 = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 9) {
                count9 ++;
            }
        }
        System.out.println(count9);

        int count10 = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 10) {
                count10 ++;
            }
        }
        System.out.println(count10);
    }


    //method
    public static void printArray(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i]);
            System.out.print(arr[i] + "|");
        }

    }//end of method

}
