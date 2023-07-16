package practice.array;

import java.util.Scanner;

public class ArrayRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];
        int a = -10, b = 10;
        for (int i = 0; i < num.length; i++) {
            //заполним элементы массива случайными натуральными числами
            num[i] = (int) (Math.random() * (b - a + 1) + a);
        }

    }

    public  void printArray ( int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
           // System.out.print(arr[i] + "|");
        }
    }//end of method
    public   int zeroCount (int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        return count;
    }
    public  int positiveCount(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        return count;
    }
    public  int evenCount(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public  int negCount (int [] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
          return count;
        }


}
