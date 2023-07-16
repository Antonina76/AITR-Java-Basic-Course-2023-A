import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {
        //Вводится n - натуральное число. Напишите метод, который получает на вход n
        // и вычисляет n! = 1 * 2 * 3 *... * n. Вызовите полученный метод.
        // При каком значении n
        // происходит переполнение памяти, выделяемой для n типа int?
        // Использовать цикл for.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Factorial calculation ");
        System.out.println("Please input your number: ");//request to user
        int n = scanner.nextInt();//the user enters a number
        n=factorial(n);//call the method
        System.out.println("Factorial is " + n );//print the result

    }
    //_______Method_______
    public static int factorial(int f){
        int result = 1;//переменная для накопления результата
        int i = 1;//начальное значение
        while (i<f){//пока растет  i до f-1
            i++;//увеличение параметра цикла
            result=result*i;//вычисление факториаля
        }//end of while
        return result;

    }//end of method



}



/* //С помощью цикла while напишите программу
        // вывода всех четных чисел в диапазоне от 2 до 100 включительно.

        System.out.println("Output even numbers from 2 to 100. ");
        int a = 0;//i set the variable

        while (a<100){
           a=a+2;//increase by 2
            System.out.println(a);
        }//end of while

 */