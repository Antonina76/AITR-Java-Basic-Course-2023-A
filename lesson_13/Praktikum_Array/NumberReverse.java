import java.util.Scanner;
public class NumberReverse {
    public static void main(String[] args) {
        //Пользователь вводит натуральное число.
        // Распечатайте это число в обратном порядке.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input integer positive number ");
        int n = scanner.nextInt();
        int digits = 0;
        int nd = n;
        //занесем цифры числа в массив, а потом распечатаем его
        // Если надо будет то мы распечатаем его в обратном порядкею

        // этот цикл считает количество цифр в числе, вычис. длину массива
        while (n > 0) {
            digits++;
            n = n / 10;
        }//end of while
        System.out.println(digits);
        int[] digit = new int[digits];//задаем массии длинной сколько у нас есть цифр в числе n
        //в массив заносим цифры числа
        for (int i = 0; i < digit.length; i++) {
            digit[i] = nd % 10;//остаток деления на 10 это и есть например567:10=>7 в остатке
            nd = nd/10;//уменьшение числа в 10 раз
        }
        printArray(digit);
        System.out.println();
        printArrayReverse(digit);
    }

    //_____Methods_____
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i]);
            System.out.print(arr[i] + "|");
        }
    }
    public static void printArrayReverse(int[] arr) {
        for (int i = arr.length-1; i >=0; i--) {
            // System.out.println(arr[i]);
            System.out.print(arr[i] + "|");
        }
    }
}