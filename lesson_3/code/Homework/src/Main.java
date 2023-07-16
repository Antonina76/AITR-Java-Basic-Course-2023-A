import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }
    }
}

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

  /*      System.out.println("Добрый день!"); // это для вывода на консоль (на печать) приветствия

//        Reader inputStreamReader = new InputStreamReader(System.in); // готовим ввод с клавиатуры
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader); // готовим ввод с клавиатуры


//        Reader inputStreamReader = new InputStreamReader(System.in); // готовим ввод с клавиатуры
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader); // готовим ввод с клавиатуры

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // вводимые значения попадвют в br

        System.out.println("Введите первое число: "); // Это приглашение к вводу
        String num1 = br.readLine(); //читаем строку с клавиатуры в переменную num1
        System.out.println("Вы ввели " + num1 + " - это первое число"); // Это сообщение пользователю
        int n1 = Integer.parseInt(num1); //преобразовываем строку в число.

        System.out.println("Введите второе число: "); // Это приглашение к вводу
        String num2 = br.readLine(); //читаем строку с клавиатуры
        System.out.println("Вы ввели " + num2 + " - это второе число"); // Это сообщение пользователю
        int n2 = Integer.parseInt(num2); //преобразовываем строку в число.

        System.out.println(" 1-е число  " + n1 + " умножить на второе число " + n2 + " получилось " + (n1 * n2) );
        System.out.println("Спасибо!");
*/
     /*   System.out.println("Добрый день!"); //это для вывода на экран

        Reader inputStreamReader = new InputStreamReader(System.in);//готовим ввод с клавиатуры
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);//готовим ввод с клавиатуры

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//вводимые значения попадают в br

        System.out.println("Введите длину стороны прямоугольника: ");// приглашение к вводу
        String num1 = br.readLine();//читаем строку с клавиатуры в переменную num1
        System.out.println("Вы ввели " + num1 + " - это длина стороны прямоугольника");//сообщение пользователю
        int n1 = Integer.parseInt(num1);//преобразовываем строку в число

        System.out.println("Введите ширину стороны прямоугольника: ");//приглашение к вводу
        String num2 = br.readLine();//читаем строку с клавиатуры
        System.out.println("Вы ввели " + num2 + " - это ширина стороны прямоугольника");//сообщение пользователю
        int n2 = Integer.parseInt(num2);// преобразовываем строку в число
        int Formula;
        Formula = 2;

        System.out.println("Итого,периметр прямоугольника равен " + Formula*(n1 + n2));
*/
/*        System.out.println("Добрый день!"); //это для вывода на экран

        Reader inputStreamReader = new InputStreamReader(System.in);//готовим ввод с клавиатуры
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);//готовим ввод с клавиатуры

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//вводимые значения попадают в br

        System.out.println("Введите длину стороны прямоугольника: ");// приглашение к вводу
        String num1 = br.readLine();//читаем строку с клавиатуры в переменную num1
        System.out.println("Вы ввели " + num1 + " - это длина стороны прямоугольника");//сообщение пользователю
        int n1 = Integer.parseInt(num1);//преобразовываем строку в число

        System.out.println("Введите ширину стороны прямоугольника: ");//приглашение к вводу
        String num2 = br.readLine();//читаем строку с клавиатуры
        System.out.println("Вы ввели " + num2 + " - это ширина стороны прямоугольника");//сообщение пользователю
        int n2 = Integer.parseInt(num2);// преобразовываем строку в число

        System.out.println("Итого,площадь прямоугольника равна " + (n1 * n2));
*/
        System.out.println("Добрый день! Я ваш Бот! Давайте знакомится. "); //это для вывода на экран

        Reader inputStreamReader = new InputStreamReader(System.in);//готовим ввод с клавиатуры
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);//готовим ввод с клавиатуры

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//вводимые значения попадают в br

        System.out.println("Как Вас зовут? ");// приглашение к вводу
        String Name = br.readLine();//читаем строку с клавиатуры в переменную num1
        System.out.println(" Вас зовут " + Name + "?" + " очень приятно ");//сообщение пользователю

        System.out.println("А сколько Вам лет?  ");//приглашение к вводу
        String Age = br.readLine();//читаем строку с клавиатуры
        int n2 = Integer.parseInt(Age);// преобразовываем строку в число

        System.out.println("Спасибо!" +  "Было приятно с Вами познакомится!");

    }
}